package org.faebie.loatis.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public HomeController() {}

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
}
