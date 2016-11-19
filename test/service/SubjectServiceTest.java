package service;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oa.domain.Subject;
import com.oa.domain.Title;
import com.oa.service.impl.SubjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
public class SubjectServiceTest {

	@Autowired
	private SubjectService subjectService;
		
	@Test
	public void testAddSubject() {
		Title title = new Title(null, "JDK的构成中不包含以下哪个部分？", "A. Java编程语言", "B. 工具及工具的API", "C. Java EE扩展API", "D. Java平台虚拟机");
		Subject subject = new Subject(null, title, "选择题", "A", "A");
		subjectService.addSubject(subject, title);
		System.out.println("****** " + subject);
	}
	
	@Test
	public void testDeleteSubjectById() {
		int id = 17;
		subjectService.deleteSubjectById(id);
	}
	
	@Test
	public void testUpdateSubject() {
		Title title = new Title(3, "JDK的构成中不包含以下哪个部分？", "A. Java编程语言", "B. 工具及工具的API", "C. Java EE扩展API", "D. Java平台虚拟机");
		Subject subject = new Subject(3, title, "选择题", "A", "A");
		subjectService.updateSubject(subject, title);
		System.out.println("****** " + subject);
	}
	
	@Test
	public void testFindSubjectById() {
		int id = 14;
		Subject subject = subjectService.findSubjectById(id);
		System.out.println("****** " + subject);
	}
	
	@Test
	public void testFindAllSubject() {
		List<Subject> subjectList = subjectService.findAllSubject();
		System.out.println("****** " + Arrays.asList(subjectList));
	}
	
}