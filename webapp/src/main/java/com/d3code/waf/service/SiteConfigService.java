package com.d3code.waf.service;

import com.baomidou.mybatisplus.service.IService;
import com.d3code.waf.bean.IpInterceptor;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.entity.SiteConfig;

import java.util.List;

/**
 * @author Aaron
 * @date 2018/5/30
 */
public interface SiteConfigService extends IService<SiteConfig> {

    /**
     * 检查域名是否被使用
     *
     * @param domain
     * @return
     */
    boolean isExits(String domain);

    /**
     * 更新站点配置信息
     * @param id
     * @param wafConfigBean
     * @param ipInterceptors
     * @return
     */
    boolean refresh(Long id, WafConfigBean wafConfigBean, List<IpInterceptor> ipInterceptors);
}