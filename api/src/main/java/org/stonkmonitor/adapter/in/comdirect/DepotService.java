package org.stonkmonitor.adapter.in.comdirect;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log4j2
@Service
public class DepotService {

    @Autowired
    ComdirectSessionHandler comdirectSessionHandler;

    private String depotId;

    JsonObject getDepotId() throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.comdirect.de/api/brokerage/clients/user/v3/depots")
                .method("GET", null)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + comdirectSessionHandler.getAccessToken())
                .addHeader("x-http-request-info", "{\"clientRequestId\":{\"sessionId\":\"" + comdirectSessionHandler.getSessionId() + "\",\"requestId\":\"" + comdirectSessionHandler.getRequestId() + "\"}}")
                .addHeader("Content-Type", "application/json")
                .addHeader("Cookie", "qSession=e43bbe27.5b1111da110ec")
                .build();
        Response response = client.newCall(request).execute();

        JsonObject response_json = new JsonParser().parse(response.body().string()).getAsJsonObject();

        request = new Request.Builder()
                .url("https://api.comdirect.de/api/brokerage/v3/depots/" + depotId + "/positions")
                .method("GET", null)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + comdirectSessionHandler.getAccessToken())
                .addHeader("x-http-request-info", "{\"clientRequestId\":{\"sessionId\":\"" + comdirectSessionHandler.getSessionId() + "\",\"requestId\":\"" + comdirectSessionHandler.getRequestId() + "\"}}")
                .addHeader("Content-Type", "application/json")
                .build();
        response = client.newCall(request).execute();
        response.body().close();

        return new JsonParser().parse(response.body().string()).getAsJsonObject();
    }
}
