/**
 * TokenController.java
 */
package com.homeai.controller;

import com.homeai.dao.entity.UserInfo;
import com.homeai.dao.service.UserInfoService;
import com.homeai.entity.ServerResult;
import com.homeai.entity.User;
import com.homeai.entity.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joker-m01
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public ServerResult getUser(String account) {

        ServerResult serverResult = new ServerResult();
        User user = new User();
        UserInfo userInfo = userInfoService.searchUserInfo(account);

        if (userInfo != null) {

            user.setName(userInfo.getNameHa());
            user.setAge(userInfo.getAgeHa());
            user.setSex(userInfo.getSex());
            user.setSysLv(userInfo.getSysLv());

            serverResult.setStatus(0);
            serverResult.setMessage("");
            serverResult.setData(user);
        }

        return serverResult;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ServerResult insertUser(UserRegister userRegister) {

    	ServerResult serverResult = new ServerResult();
    	UserInfo userInfo = null;

        if (userRegister != null) {

        	userInfo = new UserInfo();
        	userInfo.setAccoutHa(userRegister.getAccount());
        	userInfo.setPasswordHa(userRegister.getPassword());
        	userInfo.setNameHa(userRegister.getName());
        	userInfo.setAgeHa(userRegister.getAge());
        	userInfo.setSex(userRegister.getSex());
        	userInfo.setSysLv(1);

        	userInfo = userInfoService.insertUser(userInfo);
        }

        if (userInfo != null) {

        	serverResult.setStatus(0);
        	serverResult.setMessage("insert OK");
        	serverResult.setData(userInfo);
        }

        return serverResult;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ServerResult updateUser(UserRegister userRegister) {

        ServerResult serverResult = new ServerResult();
        UserInfo userInfo = null;

        if (userRegister != null) {

            userInfo = userInfoService.searchUserInfo(userRegister.getAccount());
            userInfo.setAccoutHa(userRegister.getAccount());
            userInfo.setNameHa(userRegister.getName());
            userInfo.setAgeHa(userRegister.getAge());
            userInfo.setSex(userRegister.getSex());
            userInfo.setSysLv(1);

            userInfo = userInfoService.updateUser(userInfo);
        }

        if (userInfo != null) {

            serverResult.setStatus(0);
            serverResult.setMessage("insert OK");
            serverResult.setData(userInfo);
        }

        return serverResult;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ServerResult deleteUser(String account) {

        ServerResult serverResult = new ServerResult();

        if (account != null) {

            userInfoService.deleteUser(account);
        }

        serverResult.setStatus(0);
        serverResult.setMessage("delete OK");

        return serverResult;
    }
}
