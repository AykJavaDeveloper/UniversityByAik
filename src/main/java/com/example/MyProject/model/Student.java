package com.example.MyProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
}
