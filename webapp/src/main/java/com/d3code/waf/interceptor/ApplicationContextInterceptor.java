package com.d3code.waf.interceptor;

import com.d3code.waf.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Aaron
 * @date 2017/5/27
 */
public class ApplicationContextInterceptor implements HandlerInterceptor {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getRequestURI().equals("/")){
            response.sendRedirect("/index.xhtml");
            return false;
        }
        ApplicationContext.initContext(request, response);
        return true;
    }

}