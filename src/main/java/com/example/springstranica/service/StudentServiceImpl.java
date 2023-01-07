package com.example.springstranica.service;

import com.example.springstranica.entity.Student;
import com.example.springstranica.repository.StudentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

    @Autowired
    StudentRepositoryInterface studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
