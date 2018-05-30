package com.d3code.waf.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.d3code.waf.entity.SiteConfig;
import com.d3code.waf.entity.WafConfig;
import com.d3code.waf.service.SiteConfigService;
import com.d3code.waf.service.WafConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author Aaron
 * @date 2018/5/29
 */
@Controller("settingController")
public class SettingController extends BaseController{

    @Resource
    private WafConfigService wafConfigService;
    @Resource
    private SiteConfigService siteConfigService;

    @RequestMapping(value = "/setting/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        WafConfig wafConfig = wafConfigService.selectById(1l);
        modelMap.addAttribute("config", wafConfig);
        return "/setting/input";
    }

    @RequestMapping(value = "/setting/site", method = RequestMethod.GET)
    public String website(Page<SiteConfig> page, ModelMap modelMap){
        modelMap.addAttribute("page", siteConfigService.selectPage(page));
        return "/setting/site";
    }
}
