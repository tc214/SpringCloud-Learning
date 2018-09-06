package com.zl.authservice.service;

import com.zl.authservice.pojo.AuthQuery;
import com.zl.authservice.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public User auth(AuthQuery query) {
        return new User(1L);
    }

}
