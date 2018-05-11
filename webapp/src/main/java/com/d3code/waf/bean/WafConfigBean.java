package com.d3code.waf.bean;

/**
 * @author Aaron
 * @date 2018/4/25
 */
public class WafConfigBean {
    private Boolean cookie;
    private Boolean ua;
    private Boolean post;
    private Boolean args;
    private Boolean file;
    private Boolean cc;
    private Integer ccRate;
    private Boolean scanner;
    private Boolean loadBalance;
    private Integer loadBalanceFailTimeout;
    private Boolean chain;
    private String[] chainServers;
    private Boolean tls;
    private Boolean mitm;
    private Boolean whiteIp;
    private Boolean blackIp;
    private Boolean whiteUrl;
    private Boolean blackUrl;
    private Integer acceptorThreads;
    private Integer clientToProxyWorkerThreads;
    private Integer proxyToServerWorkerThreads;
    private Integer serverPort;
    private Boolean socket;
    private String socketServer;
    private Integer socketServerPort;

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

    public Boolean getCc() {
        return cc;
    }

    public void setCc(Boolean cc) {
        this.cc = cc;
    }

    public Integer getCcRate() {
        return ccRate;
    }

    public void setCcRate(Integer ccRate) {
        this.ccRate = ccRate;
    }

    public Boolean getScanner() {
        return scanner;
    }

    public void setScanner(Boolean scanner) {
        this.scanner = scanner;
    }

    public Boolean getLoadBalance() {
        return loadBalance;
    }

    public void setLoadBalance(Boolean loadBalance) {
        this.loadBalance = loadBalance;
    }

    public Integer getLoadBalanceFailTimeout() {
        return loadBalanceFailTimeout;
    }

    public void setLoadBalanceFailTimeout(Integer loadBalanceFailTimeout) {
        this.loadBalanceFailTimeout = loadBalanceFailTimeout;
    }

    public Boolean getChain() {
        return chain;
    }

    public void setChain(Boolean chain) {
        this.chain = chain;
    }

    public String[] getChainServers() {
        return chainServers;
    }

    public void setChainServers(String[] chainServers) {
        this.chainServers = chainServers;
    }

    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    public Boolean getMitm() {
        return mitm;
    }

    public void setMitm(Boolean mitm) {
        this.mitm = mitm;
    }

    public Boolean getWhiteIp() {
        return whiteIp;
    }

    public void setWhiteIp(Boolean whiteIp) {
        this.whiteIp = whiteIp;
    }

    public Boolean getBlackIp() {
        return blackIp;
    }

    public void setBlackIp(Boolean blackIp) {
        this.blackIp = blackIp;
    }

    public Boolean getWhiteUrl() {
        return whiteUrl;
    }

    public void setWhiteUrl(Boolean whiteUrl) {
        this.whiteUrl = whiteUrl;
    }

    public Boolean getBlackUrl() {
        return blackUrl;
    }

    public void setBlackUrl(Boolean blackUrl) {
        this.blackUrl = blackUrl;
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

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public Boolean getSocket() {
        return socket;
    }

    public void setSocket(Boolean socket) {
        this.socket = socket;
    }

    public String getSocketServer() {
        return socketServer;
    }

    public void setSocketServer(String socketServer) {
        this.socketServer = socketServer;
    }

    public Integer getSocketServerPort() {
        return socketServerPort;
    }

    public void setSocketServerPort(Integer socketServerPort) {
        this.socketServerPort = socketServerPort;
    }
}
