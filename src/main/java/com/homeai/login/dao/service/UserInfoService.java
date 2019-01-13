package com.homeai.login.dao.service;

import com.homeai.login.dao.entity.UserInfo;

public interface UserInfoService {

    /**
     *
     *
     * @param account
     * @param password
     * @return
     */
    public UserInfo loginSearch(String account, String password);
}
