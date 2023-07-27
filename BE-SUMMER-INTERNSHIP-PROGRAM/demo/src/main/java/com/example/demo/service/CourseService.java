package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service

public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long courseid) {
        return courseRepository.findById(courseid);
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseid) {
        courseRepository.deleteById(courseid);
    }

    public Optional<Course> updateCourse(Course course, Long courseid) {
        Optional<Course> existingCourse = getCourseById(courseid);
        if (existingCourse.isPresent()) {
            existingCourse.get().setCoursename(course.getCoursename());
            existingCourse.get().setCoursefee(course.getCoursefee());

            courseRepository.save(existingCourse.get());
            return existingCourse;
        }
        return existingCourse;
    }

}
