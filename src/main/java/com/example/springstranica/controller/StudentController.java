package com.example.springstranica.controller;

import com.example.springstranica.entity.Student;
import com.example.springstranica.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentServiceInterface studentService;

    @PostMapping("/student")
    public Student save(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
