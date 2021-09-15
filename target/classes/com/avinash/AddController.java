package com.avinash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
	
@Controller
public class AddController 
{
	@RequestMapping("/dis")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse responce) 
	{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		
		AddService as = new AddService();
		k= as.add(i,j);
		
		System.out.println(k);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("reslut",k);
		
		return mv		;
	}
}
