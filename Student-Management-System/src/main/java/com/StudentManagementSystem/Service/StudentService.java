package com.StudentManagementSystem.Service;

import com.StudentManagementSystem.Entity.Student;
import com.StudentManagementSystem.Repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentId(Long id) {
        return studentRepository.findById(id);
    }

    public Optional<Student> getStudentEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public Student updateStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public void deleteStudent(Long studentId) {
        if (studentRepository.existsById(studentId)) {
            studentRepository.deleteById(studentId);
        } else {
            throw new EntityNotFoundException("Student with ID " + studentId + " does not exist.");
        }
    }
}
