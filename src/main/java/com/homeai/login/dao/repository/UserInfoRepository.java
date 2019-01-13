package com.homeai.login.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeai.login.dao.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    /**
     * findByAccoutHaAndPasswordHa
     *
     * @param accoutHa
     * @param passwordHa
     * @return
     */
    public UserInfo findByAccoutHaAndPasswordHa(String accoutHa, String passwordHa);
}
