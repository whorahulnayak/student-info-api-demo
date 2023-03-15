package com.rahul.demo.studentinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rahul.demo.studentinfo.service.studentInfoService;
import com.rahul.demo.studentinfo.data.Student;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class studentInfoController {
    @Autowired
    private studentInfoService studentInfoService;
    @GetMapping("/")
    public List<Student> getStudentInfo(){
        //call services
        return studentInfoService.getStudentInfo();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentInfoById(@PathVariable String id){
        return studentInfoService.getStudentInfoById(id);
    }

    @PostMapping("/")
    public Student postStudentInfo(@RequestBody Student student){
        return studentInfoService.saveStudentInfo(student);
    }

    @PutMapping("/{id}")
    public Student putStudentInfo(@PathVariable String id, @RequestBody Student student){
        return studentInfoService.updateStudentInfo(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentInfo(@PathVariable String id){
        return studentInfoService.deleteStudentInfoById(id);
    }
}
