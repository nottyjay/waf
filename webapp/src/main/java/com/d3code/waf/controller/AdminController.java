package com.d3code.waf.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.d3code.waf.entity.Admin;
import com.d3code.waf.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author Aaron
 * @date 2018/5/28
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @Resource
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Page page, ModelMap modelMap){
        adminService.selectPage(page);
        modelMap.addAttribute("page", page);
        return "/admin/list";
    }

    public String add(){
        return "/admin/input";
    }

    public String edit(Long id){
        return "/admin/input";
    }

    public String save(Admin admin){
        adminService.insert(admin);
        return null;
    }

    public String update(Admin admin){
        adminService.updateById(admin);
        return null;
    }
}
