package com.oa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 试卷管理控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin")
public class ExampaperManageController {
	
	/**
	 * 跳转到试卷管理页面
	 */
	@RequestMapping("/toExampaperManage")
	public ModelAndView toExampaperManage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/exampaperManage");
		
		return mv;
	}
}
