package com.example.springing.controller;

import com.example.springing.dto.StudentReqDto;
import com.example.springing.dto.StudentResDto;
import com.example.springing.entity.Student;
import com.example.springing.maper.StudentMapper;
import com.example.springing.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String getStudent(){
        return "hello world";
    }


    @GetMapping
    public List<StudentResDto> getAllStudents() {
        return studentService.getAllStudents().stream()
                .map(StudentMapper::toResponseDto)
                .toList();
    }

    @PostMapping
    public StudentResDto createStudent(@RequestBody StudentReqDto studentReq) {
        Student student = StudentMapper.toEntity(studentReq);
        return StudentMapper.toResponseDto(studentService.createStudent(student));
    }
}
