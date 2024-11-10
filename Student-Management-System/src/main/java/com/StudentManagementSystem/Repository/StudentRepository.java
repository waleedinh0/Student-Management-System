package com.StudentManagementSystem.Repository;

import com.StudentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findById(Long studentId);

    Optional<Student> findByEmail(String email);
}
