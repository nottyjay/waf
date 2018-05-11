package com.d3code.waf.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Aaron
 * @date 2018/4/25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleInterceptor {
    private String args;
    private String cookie;
    private String file;
    private String ip;
    private String post;
    private String ua;
    private String url;
    private String wip;
    private String wurl;

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWip() {
        return wip;
    }

    public void setWip(String wip) {
        this.wip = wip;
    }

    public String getWurl() {
        return wurl;
    }

    public void setWurl(String wurl) {
        this.wurl = wurl;
    }
}
