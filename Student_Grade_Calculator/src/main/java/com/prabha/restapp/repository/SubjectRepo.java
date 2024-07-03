package com.prabha.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
