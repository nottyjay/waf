package com.d3code.waf.bean;

/**
 * @author Aaron
 * @date 2018/4/25
 */
public class WafConfigBean {

    private Integer ccRate;
    private Integer loadBalanceFailTimeout;

    public Integer getCcRate() {
        return ccRate;
    }

    public void setCcRate(Integer ccRate) {
        this.ccRate = ccRate;
    }

    public Integer getLoadBalanceFailTimeout() {
        return loadBalanceFailTimeout;
    }

    public void setLoadBalanceFailTimeout(Integer loadBalanceFailTimeout) {
        this.loadBalanceFailTimeout = loadBalanceFailTimeout;
    }
}
