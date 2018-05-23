package com.d3code.waf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Aaron
 * @date 2018/5/23
 */
@Controller
public class PublicController extends BaseController{

    @RequestMapping(method = RequestMethod.GET, value = "/login.xhtml")
    public String login(){
        return "/public/login";
    }
}
