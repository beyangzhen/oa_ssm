package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oa.domain.Subject;
import com.oa.domain.Title;
import com.oa.mapper.SubjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
public class SubjectMapperTest {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
		
	@Test
	public void testAddSubject() {
		SqlSession session = sqlSessionFactory.openSession();
		SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
		Title title = new Title(null, "JDK的构成中不包含以下哪个部分？", "A. Java编程语言", "B. 工具及工具的API", "C. Java EE扩展API", "D. Java平台虚拟机");
		subjectMapper.addTitle(title);
		Subject subject = new Subject(null, title, "选择题", "A", "A");
		subjectMapper.addSubject(subject);
		System.out.println("****** " + subject);
	}
	
	@Test
	public void testDeleteSubjectById() {
		SqlSession session = sqlSessionFactory.openSession();
		SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
		int id = 13;
		subjectMapper.deleteSubjectById(id);
		subjectMapper.deleteTitleById(id);
	}
	
	@Test
	public void testUpdateSubject() {
		SqlSession session = sqlSessionFactory.openSession();
		SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
		Title title = new Title(3, "改JDK的构成中不包含以下哪个部分？", "A. Java编程语言", "B. 工具及工具的API", "C. Java EE扩展API", "D. Java平台虚拟机");
		subjectMapper.updateTitle(title);
		Subject subject = new Subject(3, title, "选择题", "A", "A");
		subjectMapper.updateSubject(subject);
		System.out.println("****** " + subject);
	}
	
	@Test
	public void testFindSubjectById() {
		SqlSession session = sqlSessionFactory.openSession();
		SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
		Subject subject = subjectMapper.findSubjectById(14);
		System.out.println("****** " + subject);
	}
	
	@Test
	public void testFindAllSubject() {
		SqlSession session = sqlSessionFactory.openSession();
		SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
		List<Subject> subjectList = subjectMapper.findAllSubject();
		System.out.println("****** " + subjectList);
	}
	
}