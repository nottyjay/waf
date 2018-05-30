package com.d3code.waf.controller;

import com.d3code.waf.entity.Admin;
import com.d3code.waf.exception.WafException;
import com.d3code.waf.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayDeque;

/**
 * @author Aaron
 * @date 2018/5/23
 */
@Controller
public class PublicController extends BaseController{

    @Resource
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login(){
        return "/public/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, ModelMap modelMap){
        boolean isAccess = false;
        try {
            isAccess = adminService.login(username, password);
        } catch (WafException e) {

        }
        if(isAccess){
            Admin admin = adminService.selectByUsername(username);
            setSession(Admin.LOGIN_SESSION_KEY, admin);
        }
        return "redirect:/index.xhtml";
    }
}
