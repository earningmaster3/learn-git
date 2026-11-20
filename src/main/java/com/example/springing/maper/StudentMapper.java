package com.example.springing.maper;

import com.example.springing.dto.StudentReqDto;
import com.example.springing.dto.StudentResDto;
import com.example.springing.entity.Student;

public class StudentMapper {

    //request dto

    public static Student toEntity(StudentReqDto studentReqDto){
        Student student = new Student();
        student.setName(studentReqDto.getName());
        student.setAge(studentReqDto.getAge());

        return student;
    }
//response dto
    public static StudentResDto toResponseDto(Student student){
        return new StudentResDto(student.getId(), student.getName());
    }
}
