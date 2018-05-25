package com.d3code.waf.service;

import com.baomidou.mybatisplus.service.IService;
import com.d3code.waf.entity.Admin;
import com.d3code.waf.exception.WafException;

/**
 * @author Aaron
 * @date 2018/5/24
 */
public interface AdminService extends IService<Admin>{

    /**
     * 判断用户登录
     * @param username
     * @param password
     * @return
     */
    boolean login(String username, String password) throws WafException;

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    Admin selectByUsername(String username);
}
