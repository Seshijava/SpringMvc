package com.firstapp.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("hello");
		ModelAndView modelandview= new ModelAndView("HelloPage");
		System.out.println("heck");
		modelandview.addObject("welcomeMessage","hello guys");
		return modelandview;
	}	}


 