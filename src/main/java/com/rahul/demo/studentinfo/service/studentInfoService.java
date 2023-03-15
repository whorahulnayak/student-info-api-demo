package com.rahul.demo.studentinfo.service;

import com.rahul.demo.studentinfo.data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rahul.demo.studentinfo.repository.studentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class studentInfoService {
    @Autowired
    private studentRepository studentRepository;

    public List<Student> getStudentInfo(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentInfoById(String id){
        return studentRepository.findById(Long.valueOf(id));
    }

    public Student saveStudentInfo(Student student){
        return studentRepository.save(student);
    }

    public String deleteStudentInfoById(String id){
        studentRepository.deleteById(Long.valueOf(id));
        return id;
    }

    public Student updateStudentInfo(Student student){
        //check if student exists in db or not if not create a new student
        return studentRepository.save(student);
    }
}
