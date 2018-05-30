package com.d3code.waf.service;

import com.d3code.waf.BaseTest;
import com.d3code.waf.bean.SiteProtocol;
import com.d3code.waf.entity.SiteConfig;
import org.junit.Test;

/**
 * @author Aaron
 * @date 2018/5/30
 */
public class SiteConfigServiceTest extends BaseTest{

    private SiteConfigService siteConfigService;

    @Test
    public void insertTest(){
        SiteConfig siteConfig = new SiteConfig();
        siteConfig.setDomain("www.majiadai.cn");
        SiteProtocol protocol = new SiteProtocol();
        protocol.setHttpApply(1);
        protocol.setHttpsApply(0);
        siteConfig.setProtocol(protocol);

    }
}
