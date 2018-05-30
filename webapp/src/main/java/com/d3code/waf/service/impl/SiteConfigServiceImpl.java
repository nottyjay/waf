package com.d3code.waf.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.d3code.waf.dao.SiteConfigMapper;
import com.d3code.waf.entity.SiteConfig;
import com.d3code.waf.service.SiteConfigService;
import org.springframework.stereotype.Service;

/**
 * @author Aaron
 * @date 2018/5/30
 */
@Service("siteConfigServiceImpl")
public class SiteConfigServiceImpl extends ServiceImpl<SiteConfigMapper, SiteConfig> implements SiteConfigService{
}
