package com.d3code.waf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @author Aaron
 * @date 2018/5/23
 */
@TableName("admin")
public class Admin extends BaseEntity{

    public static final String LOGIN_SESSION_KEY = "login_waf_admin";

    private String username;
    private String password;
    private String salt;
    @TableField("login_error_count")
    private Integer loginErrorCount;
    @TableField("last_error_login_date")
    private Date lastErrorLoginDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLoginErrorCount() {
        return loginErrorCount;
    }

    public void setLoginErrorCount(Integer loginErrorCount) {
        this.loginErrorCount = loginErrorCount;
    }

    public Date getLastErrorLoginDate() {
        return lastErrorLoginDate;
    }

    public void setLastErrorLoginDate(Date lastErrorLoginDate) {
        this.lastErrorLoginDate = lastErrorLoginDate;
    }
}
