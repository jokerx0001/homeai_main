/**
 * TokenController.java
 */
package com.homeai.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.homeai.dao.entity.UserInfo;
import com.homeai.dao.service.UserInfoService;
import com.homeai.entity.ServerResult;
import com.homeai.login.pojo.AccountInfo;
import com.homeai.login.pojo.User;
import com.homeai.login.pojo.UserRegister;

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
    @Cacheable(value="userToken")
    public User getToken(AccountInfo accountInfo) {

        User user = new User();
        UserInfo userInfo = userInfoService.loginSearch(accountInfo.getAccount(), accountInfo.getPassword());

        if (userInfo != null) {

            user.setName(userInfo.getNameHa());
            user.setAge(userInfo.getAgeHa());
            user.setSex(userInfo.getSex());
            user.setSysLv(userInfo.getSysLv());
        }

        return user;
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
}
