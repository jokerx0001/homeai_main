package com.homeai.dao.service;

import java.util.List;

import com.homeai.dao.entity.UserInfo;
import org.springframework.transaction.annotation.Transactional;

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
     * @param userInfo
     * @return
     */
    public UserInfo insertUser(UserInfo userInfo);

    /**
     *
     * @param userInfo
     * @return
     */
    public UserInfo updateUser(UserInfo userInfo);

    /**
     *
     * @param account
     * @return
     */
    @Transactional
    public void deleteUser(String account);
}
