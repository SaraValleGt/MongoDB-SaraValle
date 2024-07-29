package com.example.tarea_MongoDB;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private int age;

    public void setId(String id) {
    }

    // Getters and setters
}
