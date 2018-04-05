package me.afua.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public @ResponseBody class MainController {

    @RequestMapping("/")
    public String showIndex()
    {
        return "This is the index";
    }
}
