package com.zl.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.zl.gateway.task.TokenScheduledTask;


/*
调用服务前添加认证请求头过滤器
 */
public class AuthHeaderFilter extends ZuulFilter {

    public AuthHeaderFilter() {
        super();
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader("Authorization", TokenScheduledTask.token);
        return null;
    }
}