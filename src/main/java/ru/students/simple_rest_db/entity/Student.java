package ru.students.simple_rest_db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="FACULTY")
    private String faculty;
    @Column(name="AGE")
    private int age;

    public Student() {
    }

    public Student(String name, String surname, String faculty, int age) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
    }
}
