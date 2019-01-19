package com.homeai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homeai.dao.entity.UserInfo;
import com.homeai.dao.service.UserInfoService;

@Controller
public class HomeAiMainController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String initLogin() {

        return "/login";
    }

    @RequestMapping(value="/mainPage", method=RequestMethod.GET)
    public String initMainPage() {

        return "/mainPage";
    }

    @RequestMapping(value="/userManage", method=RequestMethod.GET)
    public String initUserManage(Model model) {

    	List<UserInfo> userInfoList = userInfoService.searchAllUserInfo();
    	model.addAttribute("userInfoList", userInfoList);
        return "/userManage";
    }
}
