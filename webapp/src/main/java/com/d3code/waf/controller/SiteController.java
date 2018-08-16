package com.d3code.waf.controller;

import com.d3code.waf.bean.IpInterceptor;
import com.d3code.waf.bean.WafConfigBean;
import com.d3code.waf.bean.WebResult;
import com.d3code.waf.entity.SiteConfig;
import com.d3code.waf.entity.WafConfig;
import com.d3code.waf.service.SiteConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Aaron
 * @date 2018/5/31
 */
@Controller
public class SiteController extends BaseController {

    @Resource
    private SiteConfigService siteConfigService;

    @RequestMapping(value = "/site/add", method = RequestMethod.GET)
    public String add(){
        return "/setting/site/input";
    }

    @RequestMapping(value = "/site/edit", method = RequestMethod.GET)
    public String edit(Long id, ModelMap modelMap){
        SiteConfig siteConfig = siteConfigService.selectById(id);
        modelMap.addAttribute("siteConfig", siteConfig);
        return "/setting/site/input";
    }

    @RequestMapping(value = "/site/save", method = RequestMethod.POST)
    public String save(SiteConfig siteConfig){
        siteConfigService.insert(siteConfig);
        return "redirect:/setting/site.xhtml";
    }

    @RequestMapping(value = "/site/update", method = RequestMethod.POST)
    public String update(SiteConfig siteConfig){
        siteConfigService.updateById(siteConfig);
        return "redirect:/setting/site.xhtml";
    }

    @RequestMapping(value = "/site/delete", method = RequestMethod.GET)
    public String delete(Long id){
        siteConfigService.deleteById(id);
        return "redirect:/setting/site.xhtml";
    }

    @RequestMapping(value = "/site/config", method = RequestMethod.POST)
    public @ResponseBody WebResult config(SiteConfig config){
        siteConfigService.refresh(config.getId(), config.getWafConfigBean(), config.getIpInterceptors());
        return WebResult.success("配置更新成功");
    }
}
