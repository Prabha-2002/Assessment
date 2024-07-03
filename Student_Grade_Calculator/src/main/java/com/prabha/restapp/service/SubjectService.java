package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.Subject;

public interface SubjectService {
	
	public void addSubject(Subject subject);

	public Subject getSubject(int id);

	public List<Subject> getAllSubjects();

	public void updateSubject(Subject subject);

	public void deleteSubject(int id);
}
