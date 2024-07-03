package com.prabha.restapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabha.restapp.model.Teacher;
import com.prabha.restapp.serviceimpl.TeacherServiceImpl;

@RestController
@RequestMapping("/Teachers")
@CrossOrigin("localhost://3000")

public class TeacherController {
	TeacherServiceImpl serv;

	public TeacherController(TeacherServiceImpl serv) {
		super();
		this.serv = serv;
	}

	@PostMapping
	public String insertTeacher(@RequestBody Teacher teacher) {
		String msg = "";
		try {
			serv.addTeacher(teacher);
			msg = "success";
		} catch (Exception e) {
			msg = "failure";
		}
		return msg;

	}

	@GetMapping("{id}")
	public Optional<Teacher> getTeacherById(@PathVariable("id") int id) {
		return serv.getTeacher(id);
	}

	@GetMapping("/all")
	public List<Teacher> getTeachers() {
		return serv.getAllTeachers();
	}

	@PutMapping
	public String updateTeacher(@RequestBody Teacher teacher) {
		String msg = "";
		try {
			serv.updateTeacher(teacher);
			msg = "updated done";
		} catch (Exception e) {
			msg = "updated not done";
		}
		return msg;

	}

	@DeleteMapping("{id}")
	public String deleteTeacherById(@PathVariable("id") int id) {
		String msg = "";
		try {
			serv.deleteTeacher(id);
			msg = "deleted done";
		} catch (Exception e) {
			msg = "not deleted";
		}
		return msg;

	}
}
