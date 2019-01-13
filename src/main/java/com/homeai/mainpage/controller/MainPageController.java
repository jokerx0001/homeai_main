package com.homeai.mainpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mainPage/")
public class MainPageController {

    @RequestMapping(value="/init", method=RequestMethod.GET)
    public String init() {

        return "/mainPage";
    }
}
