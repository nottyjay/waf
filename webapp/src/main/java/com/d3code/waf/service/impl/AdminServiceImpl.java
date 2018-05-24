package com.d3code.waf.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.d3code.waf.dao.AdminMapper;
import com.d3code.waf.entity.Admin;
import com.d3code.waf.service.AdminService;

/**
 * @author Aaron
 * @date 2018/5/24
 */
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService{

    @Override
    public boolean login(String username, String password) {
        // TODO 添加管理员登录判断逻辑
        return true;
    }

    @Override
    public Admin selectByUsername(String username) {
        EntityWrapper<Admin> adminEntityWrapper = new EntityWrapper<>();
        adminEntityWrapper.eq("username", username);
        return selectOne(adminEntityWrapper);
    }
}
