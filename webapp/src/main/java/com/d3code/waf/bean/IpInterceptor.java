package com.d3code.waf.bean;

/**
 * @author Aaron
 * @date 2018/5/30
 */
public class IpInterceptor {

    private Short type; // 黑白名单。0为黑名单，1为白名单
    private String ips;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }
}
