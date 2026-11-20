package com.example.springing.service;

import com.example.springing.entity.Student;
import com.example.springing.studentrepo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class
StudentService {
    private final StudentRepo studentRepo;



    public StudentService(StudentRepo studentRepo){
        this.studentRepo= studentRepo;
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student createStudent(Student student){
        return studentRepo.save(student);
    }
}
