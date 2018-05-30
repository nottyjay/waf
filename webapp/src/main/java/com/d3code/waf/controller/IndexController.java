package com.d3code.waf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Aaron
 * @date 2018/4/16
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/statistic/system";
    }
}
