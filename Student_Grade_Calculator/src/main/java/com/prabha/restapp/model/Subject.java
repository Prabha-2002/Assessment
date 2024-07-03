package com.prabha.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subject_Table")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Maths")
	private int maths;
	@Column(name = "Science")
	private int science;
	@Column(name = "Social")
	private int social;
	@Column(name = "GK")
	private int gk;
	@Column(name = "Grade")
	private float grade;
	@ManyToOne(targetEntity = Teacher.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Teacher")
	private Teacher teacher;

	public Subject() {
		super();
	}

	public Subject(int id, int maths, int science, int social, int gk, float grade, Teacher teacher) {
		super();
		this.id = id;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.gk = gk;
		this.grade = grade;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", maths=" + maths + ", science=" + science + ", social=" + social + ", gk=" + gk
				+ ", grade=" + grade + ", teacher=" + teacher + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getGk() {
		return gk;
	}

	public void setGk(int gk) {
		this.gk = gk;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
