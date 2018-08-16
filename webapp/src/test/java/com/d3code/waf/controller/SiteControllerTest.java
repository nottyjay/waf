package com.d3code.waf.controller;

import com.d3code.waf.BaseTest;
import com.d3code.waf.bean.WebResult;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author Aaron
 * @date 2018/6/21
 */
public class SiteControllerTest extends BaseTest {

    @Test
    public void configTest(){
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("id", 6);
        multiValueMap.add("wafConfigBean.ccRate", 100);
        multiValueMap.add("wafConfigBean.loadBalanceFailTimeout", 20000);
        multiValueMap.add("ipInterceptors[0].type", 0);
        multiValueMap.add("ipInterceptors[0].ips", "192.168.123.185");
        WebResult result = testRestTemplate.postForObject("/site/config.xhtml", multiValueMap, WebResult.class);
        Assert.assertEquals(result.getError(), "0000");
    }
}
