package com.example.MyProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "students_id")
    private List<Student> students;
}
