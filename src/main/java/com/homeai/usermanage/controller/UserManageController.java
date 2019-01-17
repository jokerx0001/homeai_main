package com.homeai.usermanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homeai.dao.entity.UserInfo;
import com.homeai.dao.service.UserInfoService;

@Controller
@RequestMapping("/userManage/")
public class UserManageController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value="/init", method=RequestMethod.GET)
    public String init(Model model) {

    	List<UserInfo> userInfoList = userInfoService.searchAllUserInfo();
        return "/userManage";
    }
}
