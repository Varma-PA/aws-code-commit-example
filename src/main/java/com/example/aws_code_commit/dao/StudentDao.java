package com.example.aws_code_commit.dao;


import com.example.aws_code_commit.models.TestMenuClass;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDao extends JpaRepository<TestMenuClass, Long> {
}
