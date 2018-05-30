package com.d3code.waf.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aaron
 * @date 2018/5/29
 */
public class CommonUtilTest {

    @Test
    public void randomSaltTest(){
        String salt = CommonUtil.randomSalt();
        System.out.println(salt);
        Assert.assertNotNull(salt);
    }
}
