package com.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalController {

	/**
	 * 跳转到个人中心页面
	 */
	@RequestMapping("/toPersonal")
	public String toPersonal() {
		return "personal";
	}
	
}
