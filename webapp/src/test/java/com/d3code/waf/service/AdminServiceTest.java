package com.d3code.waf.service;

import com.d3code.waf.BaseTest;
import com.d3code.waf.entity.Admin;
import com.d3code.waf.entity.WafConfig;
import com.d3code.waf.exception.WafException;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

/**
 * @author Aaron
 * @date 2018/5/25
 */
public class AdminServiceTest extends BaseTest{

    @Resource
    private AdminService adminService;

    private void insertAdmin(){
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword(DigestUtils.md5Hex("admin"));
        adminService.insert(admin);
    }

    @Test
    @Rollback
    public void loginTest(){
        insertAdmin();
        try {
            boolean result = adminService.login("admin", "admin");
            Assert.assertTrue(result);
        }catch (WafException e){
            e.printStackTrace();
        }
    }
}
