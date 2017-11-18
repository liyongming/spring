package com.cn.spring.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *@scan.java
 *@
 *@Spring
 *@author lym
 *@2017年11月18日
 *@下午5:42:59
 *@TODO
 */
@Controller
public class scan {
	@RequestMapping(value="/scan")
	public ModelAndView scan(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "注解的测试");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
		
	}
}
