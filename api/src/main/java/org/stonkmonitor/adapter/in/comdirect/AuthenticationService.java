package org.stonkmonitor.adapter.in.comdirect;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.UUID;

@Log4j2
@Service
public class AuthenticationService {

    private String sessionUuid;
    private String challengeId;
    private String accessToken;
    private String sessionId;
    private String requestId;

    private String oauth2_request_body_api_keys;
    private String oauth2_request_secondary_token;

    @Autowired
    ComdirectSessionHandler comdirectSessionhandler;

    public void authenticate() throws IOException {

        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, oauth2_request_body_api_keys);
        Request request = new Request.Builder()
                .url("https://api.comdirect.de/oauth/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", "qSession=e43bbe27.5b1111da110ec")
                .build();
        Response response = client.newCall(request).execute();

        sessionId = UUID.randomUUID().toString();

        comdirectSessionhandler.setSessionId(sessionId);

        String ts = Long.toString(System.currentTimeMillis());
        requestId = ts.substring(ts.length()-9);

        comdirectSessionhandler.setRequestId(requestId);

        JsonObject response_json = new JsonParser().parse(response.body().string()).getAsJsonObject();

        accessToken = response_json.get("access_token").getAsString();

        comdirectSessionhandler.setAccessToken(accessToken);

        log.info("request id:" + requestId);
        log.info("session id: " + sessionId);
        log.info("access token: " + response_json.get("access_token").getAsString());

        request = new Request.Builder()
                .url("https://api.comdirect.de/api/session/clients/user/v1/sessions")
                .method("GET", null)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("x-http-request-info", "{\"clientRequestId\":{\"sessionId\":\"" + sessionId +"\",\"requestId\":\"" + requestId + "\"}}")
                .addHeader("Content-Type", "application/json")
                .addHeader("Cookie", "qSession=e43bbe27.5b1111da110ec")
                .build();
        response = client.newCall(request).execute();

        String response_body = response.body().string();

        response_json = new JsonParser().parse(
                // Remove first and last char due to []
                response_body.substring(1, response_body.length()-1))
                .getAsJsonObject();

        sessionUuid = response_json.get("identifier").getAsString();

        mediaType = MediaType.parse("application/json");
        body = RequestBody.create(mediaType, "{\r\n        \"identifier\" : \"" + sessionUuid + "\",\r\n        \"sessionTanActive\": true,\r\n        \"activated2FA\": true\r\n}");
        request = new Request.Builder()
                .url("https://api.comdirect.de/api/session/clients/user/v1/sessions/1723ED30A5C24AEA9DFF5933B023F4BB/validate")
                .method("POST", body)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("x-http-request-info", "{\"clientRequestId\":{\"sessionId\":\"" + sessionId +"\",\"requestId\":\"" + requestId + "\"}}")
                .addHeader("Content-Type", "application/json")
                .addHeader("Cookie", "qSession=e43bbe27.5b1111da110ec")
                .build();
        response = client.newCall(request).execute();

        challengeId = new JsonParser().parse(response.header("x-once-authentication-info"))
                .getAsJsonObject().get("id").getAsString();

        log.info("challenge id: " + challengeId);
    }

    public void activate() throws IOException {

        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "    {\r\n        \"identifier\" : \"" + sessionUuid + "\",\r\n        \"sessionTanActive\" : true,\r\n        \"activated2FA\": true\r\n    }\r\n");
        Request request = new Request.Builder()
                .url("https://api.comdirect.de/api/session/clients/user/v1/sessions/" + sessionUuid)
                .method("PATCH", body)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("x-http-request-info", "{\"clientRequestId\":{\"sessionId\":\"" + sessionId + "\",\"requestId\":\"" + requestId + "\"}}")
                .addHeader("Content-Type", "application/json")
                .addHeader("x-once-authentication-info", "{\"id\":\"" + challengeId + "\"}")
                .addHeader("x-once-authentication", "000000")
                .addHeader("Cookie", "qSession=e43bbe27.5b1111da110ec")
                .build();
        Response response = client.newCall(request).execute();

        log.info("tan activate response: " + response.body().string());

        mediaType = MediaType.parse("application/x-www-form-urlencoded");
        body = RequestBody.create(mediaType, oauth2_request_secondary_token + accessToken);
        request = new Request.Builder()
                .url("https://api.comdirect.de/oauth/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", "qSession=e43bbe27.5b1111da110ec")
                .build();
        response = client.newCall(request).execute();

        JsonObject response_json = new JsonParser().parse(response.body().string()).getAsJsonObject();

        accessToken = response_json.get("access_token").getAsString();

        comdirectSessionhandler.setAccessToken(accessToken);
    }
}
