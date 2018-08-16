package com.d3code.waf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.d3code.waf.bean.IpInterceptor;
import com.d3code.waf.bean.SiteProtocol;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.util.JsonUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Aaron
 * @date 2018/5/30
 */
@TableName("site_config")
public class SiteConfig extends BaseEntity{

    private Integer cookie = 1;
    private Integer ua = 1;
    private Integer post = 1;
    private Integer args = 1;
    private Integer file = 1;
    @TableField("domain")
    private String domain;
    @TableField("protocol_json")
    private String protocolJson;
    @TableField("host")
    private String host;
    @TableField("waf_config_json")
    private String wafConfigJson;
    @TableField("ip_interceptor_json")
    private String ipInterceptorJson;

    public Integer getCookie() {
        return cookie;
    }

    public void setCookie(Integer cookie) {
        this.cookie = cookie;
    }

    public Integer getUa() {
        return ua;
    }

    public void setUa(Integer ua) {
        this.ua = ua;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getArgs() {
        return args;
    }

    public void setArgs(Integer args) {
        this.args = args;
    }

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

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

    @TableField(exist = false)
    private WafConfigBean wafConfigBean;
    @TableField(exist = false)
    private List<IpInterceptor> ipInterceptors;

    public WafConfigBean getWafConfigBean(){
        if(this.wafConfigBean == null) {
            if (StringUtils.isBlank(this.wafConfigJson))
                return null;
            this.wafConfigBean = JsonUtil.toBean(this.wafConfigJson, WafConfigBean.class);
        }
        return this.wafConfigBean;
    }

    public void setWafConfigBean(WafConfigBean wafConfigBean){
        this.wafConfigJson = JsonUtil.toJsonHex(wafConfigBean);
        this.wafConfigBean = wafConfigBean;
    }

    public List<IpInterceptor> getIpInterceptors() {
        if(this.ipInterceptors == null) {
            if (StringUtils.isBlank(this.ipInterceptorJson))
                return null;
            this.ipInterceptors = JsonUtil.toList(this.ipInterceptorJson, IpInterceptor.class);
        }
        return this.ipInterceptors;
    }

    public void setIpInterceptors(List<IpInterceptor> ipInterceptors) {
        this.ipInterceptorJson = JsonUtil.toJsonHex(ipInterceptors);
        this.ipInterceptors = ipInterceptors;
    }
}
