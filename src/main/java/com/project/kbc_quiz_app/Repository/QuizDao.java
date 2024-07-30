package com.project.kbc_quiz_app.Repository;

import com.project.kbc_quiz_app.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
