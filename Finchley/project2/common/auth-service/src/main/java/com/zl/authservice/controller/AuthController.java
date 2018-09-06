package com.zl.authservice.controller;

import com.zl.authservice.pojo.AuthQuery;
import com.zl.authservice.pojo.User;
import com.zl.authservice.service.AuthService;
import com.zl.common.base.ResponseData;
import com.zl.common.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.lang.StringUtils;

@RestController
@RequestMapping(value = "/oauth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/token")
    public ResponseData auth(@RequestBody AuthQuery query) throws Exception {
        return doAuth(query);
    }

    @GetMapping("/token")
    public ResponseData oauth(AuthQuery query) throws Exception {
        return doAuth(query);
    }

    private ResponseData doAuth(AuthQuery query) {
        if (StringUtils.isBlank(query.getAccessKey()) || StringUtils.isBlank(query.getSecretKey())) {
            //return ResponseData.failByParam("accessKey and secretKey not null");
        }

        User user = authService.auth(query);
        if (user == null) {
            return ResponseData.failByParam("认证失败");
        }

        System.out.println(user.toString());

        JWTUtils jwt = JWTUtils.getInstance();
        return ResponseData.ok(jwt.getToken(user.getId().toString()));
    }

}
