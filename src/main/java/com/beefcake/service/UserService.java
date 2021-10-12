package com.beefcake.service;

import com.beefcake.entity.User;

public interface UserService {
    void register(User user);

    User login(String username, String password);
}
