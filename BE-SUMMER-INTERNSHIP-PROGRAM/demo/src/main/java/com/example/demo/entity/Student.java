package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.List;
import java.util.ArrayList;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long regno;
    private String stdname;
    private String stdemail;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();
}
