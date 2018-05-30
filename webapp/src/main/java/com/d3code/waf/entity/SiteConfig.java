package com.d3code.waf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.d3code.waf.bean.IpInterceptor;
import com.d3code.waf.bean.SiteProtocol;
import com.d3code.waf.util.JsonUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Aaron
 * @date 2018/5/30
 */
@TableName("site_config")
public class SiteConfig extends BaseEntity{

    @TableField("domain")
    private String domain;
    @TableField("protocol_json")
    private String protocolJson;
    @TableField("waf_config_json")
    private String wafConfigJson;
    @TableField("ip_interceptor_json")
    private String ipInterceptorJson;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getProtocolJson() {
        return protocolJson;
    }

    public void setProtocolJson(String protocolJson) {
        this.protocolJson = protocolJson;
    }

    public String getWafConfigJson() {
        return wafConfigJson;
    }

    public void setWafConfigJson(String wafConfigJson) {
        this.wafConfigJson = wafConfigJson;
    }

    public String getIpInterceptorJson() {
        return ipInterceptorJson;
    }

    public void setIpInterceptorJson(String ipInterceptorJson) {
        this.ipInterceptorJson = ipInterceptorJson;
    }

    public SiteProtocol getProtocol() {
        if(StringUtils.isBlank(this.protocolJson))
            return null;
        return JsonUtil.toBean(this.protocolJson, SiteProtocol.class);
    }

    public void setProtocol(SiteProtocol protocol) {
        this.protocolJson = JsonUtil.toJsonHex(protocol);
    }

    public List<IpInterceptor> getIpInterceptors() {
        if(StringUtils.isBlank(this.ipInterceptorJson))
            return null;
        return JsonUtil.toList(this.ipInterceptorJson, IpInterceptor.class);
    }

    public void setIpInterceptors(List<IpInterceptor> ipInterceptors) {
        this.ipInterceptorJson = JsonUtil.toJsonHex(ipInterceptors);
    }
}
