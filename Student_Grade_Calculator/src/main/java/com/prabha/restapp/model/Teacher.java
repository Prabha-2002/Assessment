package com.prabha.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Teacher_Table")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "phone")
	private int phone;
	@Column(name = "student_Name")
	private String studentName;

	public Teacher() {
		super();
	}

	public Teacher(int id, String name, int phone, String studentName) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", phone=" + phone + ", studentName=" + studentName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
