package com.d3code.waf.controller;

import com.d3code.waf.ApplicationContext;

/**
 * @author Aaron
 * @date 2018/5/23
 */
public abstract class BaseController {

    public void setSession(String key, Object value){
        ApplicationContext.getContext().setSession(key, value);
    }

    public Object getSession(String key){
        return ApplicationContext.getContext().getSession(key);
    }

    public <T> T getSession(String key, Class<T> tClass){
        return ApplicationContext.getContext().getSession(key, tClass);
    }

    public void setCookie(String key, String value, String domain){
        ApplicationContext.getContext().setCookie(key, value, "/", 3600, domain);
    }
}
