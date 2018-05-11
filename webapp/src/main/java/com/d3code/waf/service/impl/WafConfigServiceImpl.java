package com.d3code.waf.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.d3code.waf.dao.WafConfigMapper;
import com.d3code.waf.entity.WafConfig;
import com.d3code.waf.service.WafConfigService;
import org.springframework.stereotype.Service;

/**
 * @author Aaron
 * @date 2018/5/11
 */
@Service("wafConfigServiceImpl")
public class WafConfigServiceImpl extends ServiceImpl<WafConfigMapper, WafConfig> implements WafConfigService{
}
