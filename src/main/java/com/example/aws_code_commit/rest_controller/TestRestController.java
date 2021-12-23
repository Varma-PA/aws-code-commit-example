package com.example.aws_code_commit.rest_controller;


import com.example.aws_code_commit.dao.StudentDao;
import com.example.aws_code_commit.dto.StudentCreateDTO;
import com.example.aws_code_commit.models.TestMenuClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @Autowired
    StudentDao studentDao;

    @PostMapping("/{studentName}")
    public ResponseEntity<TestMenuClass> createStudent(@PathVariable("studentName") String studentName){

        TestMenuClass testMenuClass = new TestMenuClass();

        testMenuClass.setStudentName(studentName);

        studentDao.save(testMenuClass);

        return new ResponseEntity<>(testMenuClass, HttpStatus.ACCEPTED);

    }

    @GetMapping("/all")
    public ResponseEntity<List<TestMenuClass>> getAll(){
        return new ResponseEntity<>(studentDao.findAll(), HttpStatus.ACCEPTED);
    }


}
