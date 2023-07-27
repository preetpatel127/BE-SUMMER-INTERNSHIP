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

import com.example.demo.service.CourseService;
import com.example.demo.entity.Course;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Course")
@RequiredArgsConstructor

public class CourseController {
    private final CourseService CourseService;

    @GetMapping
    public ResponseEntity<?> getCourses() {
        return ResponseEntity.ok(CourseService.getCourses());
    }

    @GetMapping("/{courseid}")
    public ResponseEntity<?> getCourseById(@PathVariable Long courseid) {
        return ResponseEntity.ok(CourseService.getCourseById(courseid));
    }

    @PostMapping
    public ResponseEntity<?> addCourse(@RequestBody Course course) {
        return ResponseEntity.ok(CourseService.addCourse(course));
    }

    @DeleteMapping("/{courseid}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseid) {
        CourseService.deleteCourse(courseid);
        return ResponseEntity.ok("Course Deleted");
    }

    @PutMapping("/{courseid}")
    public ResponseEntity<?> updateCourse(@RequestBody Course course, @PathVariable Long courseid) {
        return ResponseEntity.ok(CourseService.updateCourse(course, courseid));
    }
}
