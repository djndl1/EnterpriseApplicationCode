package sia.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // @Controllers are scanned and discovered
public class HomeController {

    @GetMapping("/") // an HTTP GET request triggers this method
    public String home() {
        return "home";
    }
}
