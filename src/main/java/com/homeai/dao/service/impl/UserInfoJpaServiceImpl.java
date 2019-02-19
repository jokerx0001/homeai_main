package com.homeai.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeai.dao.entity.UserInfo;
import com.homeai.dao.repository.UserInfoRepository;
import com.homeai.dao.service.UserInfoService;

@Service
public class UserInfoJpaServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo loginSearch(String account, String password) {

        return userInfoRepository.findByAccoutHaAndPasswordHa(account, password);
    }

	/**
	 * @param account
	 * @return
	 */
	@Override
	public UserInfo searchUserInfo(String account) {
		return userInfoRepository.findByAccoutHa(account);
	}

	@Override
	public List<UserInfo> searchAllUserInfo() {

		return userInfoRepository.findAll();
	}

	@Override
	public UserInfo insertUser(UserInfo userInfo) {

		return userInfoRepository.save(userInfo);
	}
}
