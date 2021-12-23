package com.example.aws_code_commit.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TestTable")
@Data
public class TestMenuClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

    public TestMenuClass(){

    }

    public TestMenuClass(String studentName){
        this.studentName = studentName;
    }

    public TestMenuClass(Long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "TestMenuClass{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
