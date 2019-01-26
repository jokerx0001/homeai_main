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
import com.homeai.login.pojo.AccountInfo;
import com.homeai.login.pojo.User;

/**
 * @author joker-m01
 *
 */
@RestController
@RequestMapping("/token")
public class TokenController {

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
}
