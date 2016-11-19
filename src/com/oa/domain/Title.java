package com.oa.domain;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 试题的题目类
 * 
 * @author Administrator
 *
 */
public class Title {
	/**
	 * 编号
	 */
	private Integer id;
	/**
	 * 问题
	 */
	@NotEmpty(message="{title.question.isEmpty}")
	private String question;
	/**
	 * 选项A
	 */
	@NotEmpty(message="{title.option.isEmpty}")
	private String optionA;
	/**
	 * 选项B
	 */
	@NotEmpty(message="{title.option.isEmpty}")
	private String optionB;
	/**
	 * 选项C
	 */
	@NotEmpty(message="{title.option.isEmpty}")
	private String optionC;
	/**
	 * 选项D
	 */
	@NotEmpty(message="{title.option.isEmpty}")
	private String optionD;
	
	public Title() {
	}
	public Title(Integer id, String question, String optionA, String optionB, String optionC, String optionD) {
		this.id = id;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	@Override
	public String toString() {
		return "Title [id=" + id + ", question=" + question + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", optionD=" + optionD + "]";
	}
	
}
