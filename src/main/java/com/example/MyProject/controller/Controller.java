package com.example.MyProject.controller;

import com.example.MyProject.api.Request;
import com.example.MyProject.model.Course;
import com.example.MyProject.model.Student;
import com.example.MyProject.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class Controller {
   private final Repository repository;


   @PostMapping("/")
    public boolean addCourse(@RequestBody Request request) {
       Course course = new Course();
       course.setName(request.getName());
       course.setStudents(request.getStudents());


       if (course.getName() != null) {
           repository.save(course);
           return true;
       }
       return false;
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Integer id){
       Course course = repository.getCourseById(id);
       return course;
    }
}
