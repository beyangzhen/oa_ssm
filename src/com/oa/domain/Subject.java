package com.oa.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * 试题类
 * 
 * @author Administrator
 *
 */
public class Subject {
	/**
	 * 编号
	 */
	private Integer id;
	/**
	 * 题目
	 */
	@NotNull(message="{subject.title.isNull}")
	private Title title;
	/**
	 * 试题类型
	 */
	@NotEmpty(message="{subject.type.isEmpty}")
	@Size(min=1, max=10, message="{subject.type.length.error}")
	private String type;
	/**
	 * 答题者作答的内容
	 */
	private String content;
	/**
	 * 试题答案
	 */
	@NotEmpty(message="{subject.answer.isEmpty}")
	private String answer;
	
	public Subject() {
	}
	public Subject(Integer id, Title title, String type, String answer) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.answer = answer;
	}
	public Subject(Integer id, Title title, String type, String content, String answer) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.content = content;
		this.answer = answer;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + ", type=" + type + ", content=" + content + ", answer="
				+ answer + "]";
	}
	
}
