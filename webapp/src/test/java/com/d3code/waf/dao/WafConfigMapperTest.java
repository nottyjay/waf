package com.d3code.waf.dao;

import com.d3code.waf.BaseTest;
import com.d3code.waf.bean.RuleInterceptor;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.entity.WafConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

/**
 * @author Aaron
 * @date 2018/4/25
 */
public class WafConfigMapperTest extends BaseTest{

    @Autowired
    private WafConfigMapper wafConfigMapper;

    @Test
    @Rollback
    public void testSave(){
        WafConfig wafConfig = new WafConfig();
        WafConfigBean configBean = new WafConfigBean();
        RuleInterceptor ruleInterceptor = new RuleInterceptor();
        wafConfig.setRuleInterceptor(ruleInterceptor);
        wafConfig.setWafConfig(configBean);
        wafConfigMapper.insert(wafConfig);
    }
}
