package com.pearl.onlineannonce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mView =new ModelAndView("page");
		
		mView.addObject("message","Hello Ameur");
		
		return mView;	}

}
