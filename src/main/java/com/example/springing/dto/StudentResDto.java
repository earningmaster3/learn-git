package com.example.springing.dto;

public class StudentResDto {
    private final Long id;
    private final String name;

    public StudentResDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
