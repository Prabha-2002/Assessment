package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.Teacher;

public interface TeacherService {

	public void addTeacher(Teacher teacher);

	public Teacher getTeacher(int id);

	public List<Teacher> getAllTeachers();

	public void updateOwner(Teacher teacher);

	public void deleteOwner(int id);
}