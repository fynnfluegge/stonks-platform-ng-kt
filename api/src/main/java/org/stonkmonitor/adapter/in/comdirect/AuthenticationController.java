package org.stonkmonitor.adapter.in.comdirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@CrossOrigin({"http://localhost:4200", "http://18.156.73.56:3000"})
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping(value="/2xaD5/authenticate", method= RequestMethod.GET)
    public void authenticate() {
        try {
            authenticationService.authenticate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/2xaD5/activate", method= RequestMethod.GET)
    public void activate() {
        try {
            authenticationService.activate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
