package com.d3code.waf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Aaron
 * @date 2018/4/16
 */
@Controller("/admin/index")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "/common/index";
    }
}
