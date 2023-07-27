package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseid;
    private String coursename;
    private long coursefee;
}
