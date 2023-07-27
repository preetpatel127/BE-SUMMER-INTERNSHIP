package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);

	}

}
