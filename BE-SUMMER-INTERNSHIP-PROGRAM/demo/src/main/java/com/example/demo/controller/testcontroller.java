package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class testcontroller {
    private final StudentService stService;

    // @GetMapping
    // public ResponseEntity<?> test() {
    // stService.test1();
    // return ResponseEntity.ok("Hello");
    // }
}
