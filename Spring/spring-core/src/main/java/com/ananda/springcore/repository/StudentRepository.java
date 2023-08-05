package com.ananda.springcore.repository;

import com.ananda.springcore.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
