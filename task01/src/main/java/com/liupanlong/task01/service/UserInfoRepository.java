package com.liupanlong.task01.service;

import com.liupanlong.task01.dao.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
public interface UserInfoRepository {
    UserInfo findByName(String name);

    UserInfo findByNameAndAge(String name, Integer age);

    @Query("from UserInfo u where u.name=:name")
    UserInfo findUser(@Param("name") String name);

}