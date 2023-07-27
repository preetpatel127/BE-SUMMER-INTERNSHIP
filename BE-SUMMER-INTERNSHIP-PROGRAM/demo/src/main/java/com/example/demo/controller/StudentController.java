package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService StudentService;

    @GetMapping
    public ResponseEntity<?> getStudents() {
        return ResponseEntity.ok(StudentService.getStudents());
    }

    @GetMapping("/{regno}")
    public ResponseEntity<?> getStudentById(@PathVariable Long regno) {
        return ResponseEntity.ok(StudentService.getStudentById(regno));
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student Student) {
        return ResponseEntity.ok(StudentService.addStudent(Student));
    }

    @DeleteMapping("/{regno}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long regno) {
        StudentService.deleteStudent(regno);
        return ResponseEntity.ok("Student Deleted");
    }

    @PutMapping("/{regno}")
    public ResponseEntity<?> updateStudent(@RequestBody Student Student, @PathVariable Long regno) {
        return ResponseEntity.ok(StudentService.updateStudent(Student, regno));
    }

}
