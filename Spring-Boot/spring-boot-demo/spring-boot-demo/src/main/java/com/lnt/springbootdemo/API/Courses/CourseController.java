package com.lnt.springbootdemo.API.Courses;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class CourseController {

    static List<Course> cources = new ArrayList<>();

    // POST /cources -> creating courses
    @PostMapping("/courses")
    public ResponseEntity<Void> createCourses(@RequestBody Course c) {
        ResponseEntity<Void> re = null;
        System.out.println(c);
        cources.add(c);
        re = new ResponseEntity<>(HttpStatus.CREATED);
        return re;
    }
    
    // GeT /courses -> getting all the courses
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getCourses(){
        ResponseEntity<List<Course>> re = null;
        re = new ResponseEntity<>(cources, HttpStatus.OK);
        return re;
    }
   
}
