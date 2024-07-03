package com.prabha.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.prabha.restapp.model.Teacher;
import com.prabha.restapp.repository.TeacherRepo;

@Service
public class TeacherServiceImpl {
	TeacherRepo repo;

	public TeacherServiceImpl(TeacherRepo repo) {
		super();
		this.repo = repo;
	}

	public void addTeacher(Teacher teacher) {
		repo.save(teacher);

	}

	public Optional<Teacher> getTeacher(int id) {
		return repo.findById(id);

	}

	public List<Teacher> getAllTeachers() {
		return repo.findAll();
	}

	public void updateTeacher(Teacher teacher) {
		repo.save(teacher);

	}

	public void deleteTeacher(int id) {
		repo.deleteById(id);

	}

}
