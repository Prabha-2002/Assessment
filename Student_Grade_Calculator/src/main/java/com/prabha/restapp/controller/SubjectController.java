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

import com.prabha.restapp.model.Subject;
import com.prabha.restapp.serviceimpl.SubjectServiceImpl;

@RestController
@RequestMapping("/Subjects")
@CrossOrigin("localhost://1000")
public class SubjectController {
	SubjectServiceImpl serv;

	public SubjectController(SubjectServiceImpl serv) {
		super();
		this.serv = serv;
	}

	@PostMapping
	public String insertSubject(@RequestBody Subject subject) {
		String msg = "";
		try {
			serv.addSubject(subject);
			msg = "added ";
		} catch (Exception e) {
			msg = "failed";
		}
		return msg;

	}

	@GetMapping("{id}")
	public Optional<Subject> getSubjectById(@PathVariable("id") int id) {
		return serv.getSubject(id);
	}

	@GetMapping("/all")
	public List<Subject> getSubjects() {
		return serv.getAllSubjects();
	}

	@PutMapping
	public String updateHouse(@RequestBody Subject subject) {
		String msg = "";
		try {
			serv.updateSubject(subject);
			msg = "updated";
		} catch (Exception e) {
			msg = "not updated";
		}
		return msg;

	}

	@DeleteMapping("{id}")
	public String deleteSubjectById(@PathVariable("id") int id) {
		String msg = "";
		try {
			serv.deleteSubject(id);
			msg = "deleted";
		} catch (Exception e) {
			msg = "not deleted";
		}
		return msg;

	}

}
