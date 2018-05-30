package com.d3code.waf.bean;

/**
 * @author Aaron
 * @date 2018/5/30
 */
public class SiteProtocol {

    private Integer httpApply;
    private Integer httpsApply;
    private Integer httpPort = 80;
    private Integer httpsPort = 443;
    private String caName;
    private String crtContent;
    private String keyContent;

    public Integer getHttpApply() {
        return httpApply;
    }

    public void setHttpApply(Integer httpApply) {
        this.httpApply = httpApply;
    }

    public Integer getHttpsApply() {
        return httpsApply;
    }

    public void setHttpsApply(Integer httpsApply) {
        this.httpsApply = httpsApply;
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public String getCrtContent() {
        return crtContent;
    }

    public void setCrtContent(String crtContent) {
        this.crtContent = crtContent;
    }

    public String getKeyContent() {
        return keyContent;
    }

    public void setKeyContent(String keyContent) {
        this.keyContent = keyContent;
    }
}
