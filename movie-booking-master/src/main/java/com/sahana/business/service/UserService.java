package com.sahana.business.service;

import com.sahana.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
