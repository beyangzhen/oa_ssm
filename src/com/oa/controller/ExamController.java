package com.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 考试控制器
 * 
 * @author Administrator
 *
 */
@Controller
public class ExamController {
	
	/**
	 * 跳转到我的考试页面
	 */
	@RequestMapping("/toHistoryExam")
	public String toHistoryExam() {
		return "historyExam";
	}
	
	/**
	 * 跳转到考试页面
	 */
	@RequestMapping("/toExam")
	public String toExam() {
		return "exam";
	}
	
}
