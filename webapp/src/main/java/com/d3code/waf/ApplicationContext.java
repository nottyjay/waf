package com.d3code.waf;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Aaron
 * @date 2017/5/27
 */
public class ApplicationContext {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContext.class);
	
    private static ThreadLocal<ApplicationContext> threadLocalContext = new ThreadLocal<>();

    private String token;
    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final HttpSession session;

    private ApplicationContext(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }
    
    public static void initContext(HttpServletRequest request, HttpServletResponse response){
    	ApplicationContext applicationContext = getContext();
    	if(LOG.isDebugEnabled()){
			LOG.debug("Doing Initial ApplicationContext[{}].", applicationContext);
		}
    	// 防止多次初始化
    	if(applicationContext == null){
    		if(LOG.isDebugEnabled()){
    			LOG.debug("ApplicationContext init...");
    		}
    		threadLocalContext.set(new ApplicationContext(request, response));
    	}
    }
    
    public static ApplicationContext getContext(){
        return threadLocalContext.get();
    }

    public HttpServletRequest getRequest() {
    	if(getContext() == null){
    		return null;
    	}
    	
        return getContext().request;
    }

    public HttpServletResponse getResponse() {
    	if(getContext() == null){
    		return null;
    	}
    	
        return getContext().response;
    }

    public HttpSession getSession() {
    	if(getContext() == null){
    		return null;
    	}
    	
        return getContext().session;
    }

    public void setSession(String key, Object value){
    	if(getContext() == null || getContext().session == null){
    		return;
    	}
    	
        getContext().session.setAttribute(key, value);
    }

    public Object getSession(String key){
    	if(getContext() == null || getContext().session == null){
    		return null;
    	}
    	
        return getContext().session.getAttribute(key);
    }

    public <T> T getSession(String key, Class<T> tClass){
    	if(getContext() == null || getContext().session == null){
    		return null;
    	}
    	
        return (T)getContext().session.getAttribute(key);
    }

    public void removeSession(String key){
    	if(getContext() == null || getContext().session == null){
    		return;
    	}
    	
        getContext().session.removeAttribute(key);
    }

    public boolean isExistInSession(String key){
    	if(getContext() == null || getContext().session == null){
    		return false;
    	}
    	
        return getSession(key) != null;
    }

    public void setCookie(String key, String value){
        setCookie(key, value, "/");
    }

    public void setCookie(String key, String value, String path){
        setCookie(key, value, path, 3600);
    }

    public void setCookie(String key, String value, Integer timeout){
        setCookie(key, value, "/", timeout);
    }
    
    public void setCookie(String key, String value, String path, Integer timeout){
    	setCookie(key, value, path, timeout, null);
    }

    public void setCookie(String key, String value, String path, Integer timeout, String domain){
        if(getContext() == null){
            return;
        }
        Cookie cookie = new Cookie(key, value);
        cookie.setPath(path);
        cookie.setMaxAge(timeout);
        cookie.setDomain(domain);
        getContext().response.addCookie(cookie);
    }

    public void removeCookie(String key){
        setCookie(key, "", 0);
    }
    
	public void distory() {
		threadLocalContext.remove();
	}
}