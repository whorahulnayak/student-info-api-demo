package com.rahul.demo.studentinfo.repository;

import com.rahul.demo.studentinfo.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface studentRepository extends JpaRepository<Student, Long> {
}
