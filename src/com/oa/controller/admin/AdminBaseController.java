package com.oa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminBaseController {
	
	@RequestMapping("/toIndex")
	public String toIndex() {
		System.out.println(">>>>>> 进入后台首页");
		return "admin/index";
	}
}
