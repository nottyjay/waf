package com.d3code.waf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.d3code.waf.bean.RuleInterceptor;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.util.JsonUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Aaron
 * @date 2018/4/24
 */
@TableName("waf_config")
public class WafConfig extends BaseEntity {

    private Boolean cookie;
    private Boolean ua;
    private Boolean post;
    private Boolean args;
    private Boolean file;
    @TableField("acceptor_threads")
    private Integer acceptorThreads;
    @TableField("client2proxy_worker_threads")
    private Integer clientToProxyWorkerThreads;
    @TableField("proxy2server_worker_threads")
    private Integer proxyToServerWorkerThreads;

    @TableField("rule_interceptor")
    private String ruleInterceptorJson;

    public Boolean getCookie() {
        return cookie;
    }

    public void setCookie(Boolean cookie) {
        this.cookie = cookie;
    }

    public Boolean getUa() {
        return ua;
    }

    public void setUa(Boolean ua) {
        this.ua = ua;
    }

    public Boolean getPost() {
        return post;
    }

    public void setPost(Boolean post) {
        this.post = post;
    }

    public Boolean getArgs() {
        return args;
    }

    public void setArgs(Boolean args) {
        this.args = args;
    }

    public Boolean getFile() {
        return file;
    }

    public void setFile(Boolean file) {
        this.file = file;
    }

    public Integer getAcceptorThreads() {
        return acceptorThreads;
    }

    public void setAcceptorThreads(Integer acceptorThreads) {
        this.acceptorThreads = acceptorThreads;
    }

    public Integer getClientToProxyWorkerThreads() {
        return clientToProxyWorkerThreads;
    }

    public void setClientToProxyWorkerThreads(Integer clientToProxyWorkerThreads) {
        this.clientToProxyWorkerThreads = clientToProxyWorkerThreads;
    }

    public Integer getProxyToServerWorkerThreads() {
        return proxyToServerWorkerThreads;
    }

    public void setProxyToServerWorkerThreads(Integer proxyToServerWorkerThreads) {
        this.proxyToServerWorkerThreads = proxyToServerWorkerThreads;
    }

    public String getRuleInterceptorJson() {
        return ruleInterceptorJson;
    }

    public void setRuleInterceptorJson(String ruleInterceptorJson) {
        this.ruleInterceptorJson = ruleInterceptorJson;
    }

    public RuleInterceptor getRuleInterceptor(){
        if(StringUtils.isEmpty(this.ruleInterceptorJson)){
            return null;
        }
        return JsonUtil.toBean(this.ruleInterceptorJson, RuleInterceptor.class);
    }

    public void setRuleInterceptor(RuleInterceptor ruleInterceptor){
        if(ruleInterceptor == null){
            this.ruleInterceptorJson = null;
        }
        this.ruleInterceptorJson = JsonUtil.toJsonHex(ruleInterceptor);
    }


}
