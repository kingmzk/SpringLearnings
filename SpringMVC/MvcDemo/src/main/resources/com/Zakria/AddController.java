package com.Zakria;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
//{
//  @RequestMapping(value="/add")
//  @ResponseBody
//  public String add()
//  {
//	  System.out.println("it is working");
//	 return "display.jsp";
//  }
//}
  @RequestMapping(value="/add")
  public ModelAndView add(@RequestParam("t1") int i,RequestParam("t2") int j ,HttpServletRequest request,HttpServletResponse response)
  {
//	  int i = Integer.ParseInt(request.getParameter("t1"));   //we have used requestParam
//	  int j = Integer.ParseInt(request.getParameter("t2"));
	 // int k = i + j;          //this logical part  should be done in Service Class
	  
	  AddService as = new AddService();
	  int k = as.add(i , j);
	  
	  
	  
	  
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("display.jsp");
	  mv.addObject("result" , k);
	  
	  
	  return mv;
  }