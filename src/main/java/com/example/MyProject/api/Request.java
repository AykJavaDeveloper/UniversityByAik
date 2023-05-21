package com.example.MyProject.api;

import com.example.MyProject.model.Student;
import lombok.Data;

import java.util.List;

@Data
public class Request {
    private String name;
    private List<Student> students;
}
