package club.cheapok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/valera")
    @ResponseBody
    public String iaka() {
        return "This Valera";
    }

    @GetMapping("/ion")
    @ResponseBody
    public String iakaIon() {
        return "Iaka Ion";
    }

}
