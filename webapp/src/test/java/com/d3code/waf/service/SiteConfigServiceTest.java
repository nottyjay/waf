package com.d3code.waf.service;

import com.d3code.waf.BaseTest;
import com.d3code.waf.bean.SiteProtocol;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.entity.SiteConfig;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author Aaron
 * @date 2018/5/30
 */
public class SiteConfigServiceTest extends BaseTest{

    @Resource
    private SiteConfigService siteConfigService;

    @Test
    public void insertTest(){
        SiteConfig siteConfig = new SiteConfig();
        siteConfig.setDomain("www.majiadai.cn");
        SiteProtocol protocol = new SiteProtocol();
        protocol.setHttpApply(1);
        protocol.setHttpsApply(0);
        siteConfig.setProtocol(protocol);
        siteConfig.setHost("101.132.166.247");
        WafConfigBean wafConfigBean = new WafConfigBean();
        wafConfigBean.setCcRate(1);
        wafConfigBean.setLoadBalanceFailTimeout(20 * 1000);
        siteConfig.setWafConfigBean(wafConfigBean);

        siteConfigService.insert(siteConfig);

    }
}
