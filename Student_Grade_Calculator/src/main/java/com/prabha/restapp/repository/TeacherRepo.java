package com.prabha.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Teacher;

@Repository

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
