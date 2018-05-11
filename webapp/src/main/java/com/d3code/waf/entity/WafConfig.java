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
    @TableField("waf_config")
    private String wafConfigJson;
    @TableField("rule_interceptor")
    private String ruleInterceptorJson;

    public String getWafConfigJson() {
        return wafConfigJson;
    }

    public void setWafConfigJson(String wafConfigJson) {
        this.wafConfigJson = wafConfigJson;
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

    public WafConfigBean getWafConfig(){
        if(StringUtils.isEmpty(this.wafConfigJson)){
            return null;
        }
        return JsonUtil.toBean(this.wafConfigJson, WafConfigBean.class);
    }

    public void setWafConfig(WafConfigBean wafConfigBean){
        if(wafConfigBean == null){
            this.wafConfigJson = null;
        }
        this.wafConfigJson = JsonUtil.toJsonHex(wafConfigBean);
    }
}
