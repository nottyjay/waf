package com.d3code.waf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author Nottyjay
 * @date 2017/5/5
 */
@Configuration
public class FreemarkerConfiguration {

    @Autowired
    private Environment environment;

    @Autowired
    protected freemarker.template.Configuration configuration;
    @Autowired
    protected org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver resolver;
    @Autowired
    protected org.springframework.web.servlet.view.InternalResourceViewResolver springResolver;

    @PostConstruct
    public void setSharedVariable() {
        configuration.setDateFormat("yyyy/MM/dd");
        configuration.setDateTimeFormat("yyyy-MM-dd HH:mm:ss");
        configuration.setTimeFormat("HH:mm:ss");
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateUpdateDelayMilliseconds(3600 * 1000);
        configuration.setTagSyntax(freemarker.template.Configuration.AUTO_DETECT_TAG_SYNTAX);
        configuration.setWhitespaceStripping(true);
        configuration.setClassicCompatible(true);
        configuration.setNumberFormat("#");

        /**
         * 配置Freemarker视图解析器
         */
        if("false".equals(environment.getProperty("debug").toLowerCase())) {
            resolver.setCache(true); //是否缓存模板
        }
        resolver.setRequestContextAttribute("request"); //为模板调用时，调用request对象的变量名
        resolver.setOrder(0);
    }
}