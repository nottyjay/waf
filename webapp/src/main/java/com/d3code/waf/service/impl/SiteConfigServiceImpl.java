package com.d3code.waf.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.d3code.waf.bean.IpInterceptor;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.dao.SiteConfigMapper;
import com.d3code.waf.entity.SiteConfig;
import com.d3code.waf.entity.WafConfig;
import com.d3code.waf.service.SiteConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aaron
 * @date 2018/5/30
 */
@Service("siteConfigServiceImpl")
public class SiteConfigServiceImpl extends ServiceImpl<SiteConfigMapper, SiteConfig> implements SiteConfigService{

    @Override
    public boolean insert(SiteConfig entity) {
        // check site config exit
        if(isExits(entity.getDomain())) {
            return super.insert(entity);
        }
        return false;
    }

    @Override
    public boolean isExits(String domain){
        EntityWrapper<SiteConfig> wrapper = new EntityWrapper<>();
        wrapper.eq("domain", domain);
        if(baseMapper.selectCount(wrapper) > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean refresh(Long id, WafConfigBean wafConfigBean, List<IpInterceptor> ipInterceptors) {
        SiteConfig persistent = selectById(id);
        persistent.setWafConfigBean(wafConfigBean);
        persistent.setIpInterceptors(ipInterceptors);
        return updateById(persistent);
    }
}
