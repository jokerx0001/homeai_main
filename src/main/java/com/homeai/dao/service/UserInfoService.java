package com.homeai.dao.service;

import java.util.List;

import com.homeai.dao.entity.UserInfo;

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
     * @return
     */
    public List<UserInfo> searchAllUserInfo();
}
