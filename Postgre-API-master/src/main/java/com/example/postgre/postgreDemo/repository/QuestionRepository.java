package com.example.postgre.postgreDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgre.postgreDemo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	

}
