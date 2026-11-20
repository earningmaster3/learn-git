package com.example.springing.dto;

public class StudentReqDto {
    private String name;
    private int age;

    public StudentReqDto() {
    }

    public StudentReqDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
