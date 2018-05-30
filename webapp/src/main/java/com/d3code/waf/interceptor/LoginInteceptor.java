package com.d3code.waf.interceptor;

import com.d3code.waf.entity.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Aaron
 * @date 2018/5/23
 */
public class LoginInteceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
//        HttpSession session = request.getSession();
//        if((!request.getRequestURI().equals("/login.xhtml")) && session.getAttribute(Admin.LOGIN_SESSION_KEY) == null){
//            response.sendRedirect("/login.xhtml");
//            return false;
//        }
//        return true;
    }
}
