package com.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping("/toIndex")
	public String toIndex() {
		System.out.println(">>>>>> 进入首页");
		return "index";
	}
}
