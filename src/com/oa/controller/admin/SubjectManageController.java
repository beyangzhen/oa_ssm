package com.oa.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oa.domain.Subject;
import com.oa.domain.Title;
import com.oa.service.impl.SubjectService;

/**
 * 试题管理控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin")
public class SubjectManageController {
	
	@Autowired
	private SubjectService subjectService;
	
	/**
	 * 跳转到试题管理页面
	 */
	@RequestMapping("/toSubjectManage")
	public ModelAndView toSubjectManage() {
		List<Subject> subjectList = subjectService.findAllSubject();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/subjectManage");
		mv.addObject("subjectList", subjectList);
		
		return mv;
	}
	
	/**
	 * 跳转到添加试题页面
	 */
	@RequestMapping("/toAddSubject")
	public String toAddSubject() {
		return "admin/addSubject";
	}
	
	/**
	 * 跳转到修改试题页面
	 */
	@RequestMapping("/toUpdateSubject")
	public String toUpdateSubject(Model model, @RequestParam(value="id") Integer id) {
		// 让修改试题时，表单上默认显示修改前的数据
		Subject subject = subjectService.findSubjectById(id);
		model.addAttribute("subject", subject);
		
		return "admin/updateSubject";
	}
	
	/**
	 * 添加试题
	 */
	@RequestMapping("/addSubject")
	public String addSubject(
						Model model,
						// 方式一：springmvc自动将 "request域中请求参数值" 绑定到 "形参中POJO对象"（前提：①参数名和类属性名必须一致 
						//															        ②级联属性，则页面表单中属性名字要写成 title.question、title.optionA）
						// 方式二：请求参数和类属性一致时，@RequestParam()也可以不写
						@Validated
						Subject subject,
						BindingResult result
					) throws Exception {
		if(result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			// 可以直接使用model将提交pojo回显到页面
		    model.addAttribute("subject", subject);
		    
			return "admin/addSubject";
		}
		
		Title title = subject.getTitle();
		subjectService.addSubject(subject, title);
		
		return "redirect:toSubjectManage";
	}
	
	/**
	 * 删除试题
	 */
	@RequestMapping("/deleteSubject")
	public String deleteSubject(@RequestParam(value="id") Integer id) {
		subjectService.deleteSubjectById(id);
		
		return "redirect:toSubjectManage";
	}
	
	/**
	 * 修改试题
	 */
	@RequestMapping("/updateSubject")
	public String updateSubject(
						// 方式一：springmvc自动将 "request域中请求参数值" 绑定到 "形参中POJO对象"（前提：①参数名和类属性名必须一致 
						//															        ②级联属性，则页面表单中属性名字要写成 title.question、title.optionA）
						// 方式二：请求参数和类属性一致时，@RequestParam()也可以不写
						@RequestParam(value="id") Integer id,
						@RequestParam(value="question") String question,
						@RequestParam(value="optionA", required=false) String optionA, // required=false代表，页面request请求中的参数可以没有该参数
						@RequestParam(value="optionB", required=false) String optionB,
						@RequestParam(value="optionC", required=false) String optionC,
						@RequestParam(value="optionD", required=false) String optionD,
						@RequestParam(value="type") String type,
						@RequestParam(value="answer") String answer
					) {
		Title title = new Title(id, question, optionA, optionB, optionC, optionD);
		Subject subject = new Subject(id, title, type, answer);
		subjectService.updateSubject(subject, title);
		
		return "redirect:toSubjectManage";
	}
	
	// 让修改试题时，表单上默认显示修改前的数据（另一种写法）
	/* 
	@ModelAttribute
	public void getSubject(@RequestParam(value="id", required=false) Integer id, Map<String, Object> map) {
		if(id != null ) {
			Subject subject = subjectService.findSubjectById(id);
			// 设置到map中
			map.put("subject", subject);
		}
	}
	@RequestMapping("/updateSubject")
	public String updateSubject(Subject subject, Title title) {
		subjectService.updateSubject(subject, title);
		return "redirect:toSubjectManage";
	}
	*/
	
}
