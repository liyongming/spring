package com.cn.spring.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.spring.po.Book;

/**
 *@BookController.java
 *@
 *@spring
 *@author lym
 *@2017年11月25日
 *@下午12:45:31
 *@TODO
 */
@Controller
public class BookController {
	@RequestMapping(value="/bookController")
	public void bookController(HttpServletRequest req,HttpServletResponse res) throws Exception{
		Book book = new Book();
		book.setId("1");
		book.setName("liyongming");
		ObjectMapper mapper = new ObjectMapper();
		String bookString = mapper.writeValueAsString(book);
		System.out.println(bookString);
		//返回数据到success:function的data 中
		res.getWriter().println("13123");
	}
	@RequestMapping(value="/login")
	public ModelAndView login(String name,String age,ModelAndView mv) throws Exception{
		mv.addObject("name", name);
		mv.addObject("age",age);
		mv.setViewName("success");
		return mv;
	}
}
