package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
// @RequiredArgsConstructor
public class StudentService {

    // private final StudentRepository studentRepository;

    // private final CourseRepository courseRepository;

    // public void test1(){
    // Student st = new Student();
    // st.setStdemail("someemail");
    // st.setStdname("somename");

    // course c = new course();
    // c.setCoursefee(10000);
    // c.setCoursename("coursename");
    // List<course> c1 = st.getCourses();
    // c1.add(c);
    // st.setCourses(c1);

    // studentRepository.save(st);
    // }
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long regno) {
        return studentRepository.findById(regno);
    }

    public Student addStudent(Student Student) {
        return studentRepository.save(Student);
    }

    public void deleteStudent(Long regno) {
        studentRepository.deleteById(regno);
    }

    public Optional<Student> updateStudent(Student student, Long regno) {
        Optional<Student> existingStudent = this.getStudentById(regno);
        if (existingStudent.isPresent()) {
            existingStudent.get().setStdname(student.getStdname());
            existingStudent.get().setStdemail(student.getStdemail());
            existingStudent.get().setCourses(student.getCourses());

            studentRepository.save(existingStudent.get());
            return existingStudent;
        }
        return existingStudent;
    }

}
