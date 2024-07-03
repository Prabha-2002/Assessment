package com.prabha.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prabha.restapp.model.Subject;
import com.prabha.restapp.repository.SubjectRepo;

@Service
public class SubjectServiceImpl {
	SubjectRepo repo;

	public SubjectServiceImpl(SubjectRepo repo) {
		super();
		this.repo = repo;
	}

	public void addSubject(Subject subject) {
		repo.save(subject);

	}

	public Optional<Subject> getSubject(int id) {
		return repo.findById(id);
	}

	public List<Subject> getAllSubjects() {
		return repo.findAll();
	}

	public void updateSubject(Subject subject) {
		repo.save(subject);

	}

	public void deleteSubject(int id) {
		repo.deleteById(id);

	}

}
