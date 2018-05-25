package com.d3code.waf.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.d3code.waf.dao.AdminMapper;
import com.d3code.waf.entity.Admin;
import com.d3code.waf.exception.WafException;
import com.d3code.waf.service.AdminService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author Aaron
 * @date 2018/5/24
 */
@Service("adminServiceImpl")
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService{

    @Override
    public boolean login(String username, String password) throws WafException {
        if(StringUtils.isBlank(username)){
            throw new WafException("Username can not be null");
        }
        if(StringUtils.isBlank(password)){
            throw new WafException("Password can not be null");
        }
        // 添加管理员登录判断逻辑
        Admin persistent = selectByUsername(username);
        if(password.equals(DigestUtils.md5Hex("password"))){
            return true;
        }
        return false;
    }

    @Override
    public Admin selectByUsername(String username) {
        EntityWrapper<Admin> adminEntityWrapper = new EntityWrapper<>();
        adminEntityWrapper.eq("username", username);
        return selectOne(adminEntityWrapper);
    }
}
