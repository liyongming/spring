package com.cn.spring.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *@hello.java
 *@
 *@Spring
 *@author lym
 *@2017年11月18日
 *@下午5:23:28
 *@TODO
 */
public  class hello implements Controller{
	private static final Log logger = LogFactory.getLog(hello.class);
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("handlerRequest被调用");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "handler被调用了...");
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
