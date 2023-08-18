package com.ananda.springcore.controller;


import com.ananda.springcore.Exception.ResourceNotFoundException;
import com.ananda.springcore.entity.Student;
import com.ananda.springcore.repository.StudentRepository;
import com.ananda.springcore.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {

    final StudentRepository studentRepository;

    final StudentService studentService;

    public StudentController(StudentRepository studentRepository, StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }

    @GetMapping("hi")
    public Student sayHi(){
        Student student = new Student("A","B");
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/students")
    List<Student> allStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    Student getStudent(@PathVariable Long id) throws ResourceNotFoundException {
       return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student newStudent(@RequestBody Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @GetMapping("test")
    public String test(){
        return "done!";
    }

//    @PutMapping("/students/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student newStudent) {
//        return studentRepository.findById(id).update(newStudent);
//    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
