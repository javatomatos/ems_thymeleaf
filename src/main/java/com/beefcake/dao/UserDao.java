package com.beefcake.dao;

import com.beefcake.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    void save(User user);

    User login(@Param("username") String username, @Param("password")String password);
}
