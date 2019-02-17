package com.homeai.dao.service;

import java.util.List;

import com.homeai.dao.entity.UserInfo;
import com.homeai.login.pojo.User;

public interface UserInfoService {

    /**
     *
     *
     * @param account
     * @param password
     * @return
     */
    public UserInfo loginSearch(String account, String password);

    /**
     *
     *
     * @param account
     * @return
     */
    public UserInfo searchUserInfo(String account);

    /**
     *
     * @return
     */
    public List<UserInfo> searchAllUserInfo();

    /**
     *
     * @param user
     * @return
     */
    public UserInfo insertUser(UserInfo userInfo);
}
