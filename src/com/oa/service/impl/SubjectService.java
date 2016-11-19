package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.domain.Subject;
import com.oa.domain.Title;
import com.oa.mapper.SubjectMapper;
import com.oa.service.ISubjectService;

@Service
public class SubjectService implements ISubjectService {
	
	@Autowired
	private SubjectMapper subjectMapper;

	@Transactional
	@Override
	public void addSubject(Subject subject, Title title) {
		subjectMapper.addTitle(title);
		subjectMapper.addSubject(subject);
	}

	@Transactional
	@Override
	public void deleteSubjectById(int id) {
		subjectMapper.deleteSubjectById(id);
		subjectMapper.deleteTitleById(id);
	}
	
	@Transactional
	@Override
	public void updateSubject(Subject subject, Title title) {
		subjectMapper.updateTitle(title);
		subjectMapper.updateSubject(subject);
	}

	@Transactional
	@Override
	public Subject findSubjectById(int id) {
		Subject subject = subjectMapper.findSubjectById(id);
		return subject;
	}

	@Transactional
	@Override
	public List<Subject> findAllSubject() {
		List<Subject> subjectList = subjectMapper.findAllSubject();
		return subjectList;
	}
	
}
