package com.ananda.springcore.controller;


import com.ananda.springcore.entity.Student;
import com.ananda.springcore.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("hi")
    public Student sayHi(){

        Student student = new Student("A","B");
        studentRepository.save(student);
        return student;
    }
}
