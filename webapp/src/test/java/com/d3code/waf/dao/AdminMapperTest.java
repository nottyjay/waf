package com.d3code.waf.dao;

import com.d3code.waf.BaseTest;
import com.d3code.waf.bean.RuleInterceptor;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.entity.Admin;
import com.d3code.waf.entity.WafConfig;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

/**
 * @author Aaron
 * @date 2018/5/25
 */
public class AdminMapperTest extends BaseTest{

    @Autowired
    private AdminMapper adminMapper;

    @Test
    @Rollback
    public void testSave(){
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword(DigestUtils.md5Hex("admin"));
        adminMapper.insert(admin);
        Assert.assertNotNull(admin.getId());
    }

}
