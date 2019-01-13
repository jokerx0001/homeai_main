package com.homeai.login.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeai.login.dao.entity.UserInfo;
import com.homeai.login.dao.repository.UserInfoRepository;
import com.homeai.login.dao.service.UserInfoService;

@Service
public class UserInfoJpaServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo loginSearch(String account, String password) {

        return userInfoRepository.findByAccoutHaAndPasswordHa(account, password);
    }
}
