package com.homeai.usermanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/userManage/")
public class UserManageController {

    @RequestMapping(value="/init", method=RequestMethod.GET)
    public String init() {

        return "/userManage";
    }
}
