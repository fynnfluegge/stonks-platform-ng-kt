package org.algo.invest.api.comdirect;

import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin({"http://localhost:4200", "http://18.156.73.56:3000"})
public class DepotController {

    @Autowired
    DepotService depotService;

    @RequestMapping(value="/2xaD5/depot", method= RequestMethod.GET)
    public List<JsonObject> getDepot() {
        try {
            depotService.getDepotId();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
