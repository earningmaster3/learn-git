package com.example.springing.studentrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springing.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
