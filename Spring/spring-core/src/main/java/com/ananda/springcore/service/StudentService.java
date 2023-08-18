package com.ananda.springcore.service;

import com.ananda.springcore.Exception.ResourceNotFoundException;
import com.ananda.springcore.entity.Student;
import com.ananda.springcore.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(Long id) throws ResourceNotFoundException {
        var response = studentRepository.findById(id);
        if(response.isEmpty()) {
            throw new ResourceNotFoundException();
        }
        return studentRepository.findById(id).get();
    }
}
