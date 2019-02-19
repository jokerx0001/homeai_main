package com.homeai.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeai.dao.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    /**
     * findByAccoutHaAndPasswordHa
     *
     * @param accoutHa account
     * @param passwordHa password
     * @return inserted object
     */
    UserInfo findByAccoutHaAndPasswordHa(String accoutHa, String passwordHa);

    /**
     *
     * @param accoutHa
     * @return
     */
    UserInfo findByAccoutHa(String accoutHa);

    /**
     *
     * @param accoutHa
     * @return
     */
    void deleteByAccoutHa(String accoutHa);
}
