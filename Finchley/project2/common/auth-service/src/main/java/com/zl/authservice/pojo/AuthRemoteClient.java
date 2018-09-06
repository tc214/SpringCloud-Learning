package com.zl.authservice.pojo;

import com.zl.common.base.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 认证服务API调用客户端
 *
 **/
@FeignClient(value = "auth-service", path = "/oauth")
public interface AuthRemoteClient {

    /**
     * 调用认证,获取token
     * @param query
     * @return
     */
    @PostMapping("/token")
    ResponseData auth(@RequestBody AuthQuery query);

}
