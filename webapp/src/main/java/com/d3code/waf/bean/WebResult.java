package com.d3code.waf.bean;

/**
 * @author Aaron
 * @date 2018/6/20
 */
public class WebResult {

    public enum Status{
        ERROR("-9999", "系统处理失败"),
        SUCCESS("0000", "处理成功");

        private String code;
        private String message;

        Status(String code, String message){
            this.code = code;
            this.message = message;
        }

        public String getCode(){
            return this.code;
        }

        public String getMessage(){
            return this.message;
        }
    }

    private String error;
    private String message;

    public WebResult(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public WebResult(Status status, String message){
        this.error = status.getCode();
        this.message = message;
    }

    public WebResult(Status status){
        this.error = status.getCode();
        this.message = status.getMessage();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static WebResult error(String message){
        return new WebResult(Status.ERROR, message);
    }

    public static WebResult success(String message){
        return new WebResult(Status.SUCCESS, message);
    }
}
