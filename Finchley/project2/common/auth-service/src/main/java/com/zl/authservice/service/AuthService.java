package com.zl.authservice.service;


import com.zl.authservice.pojo.AuthQuery;
import com.zl.authservice.pojo.User;

public interface AuthService {

    default User auth(AuthQuery query) {
//        return null;
        return new User(12L);
    }

}
