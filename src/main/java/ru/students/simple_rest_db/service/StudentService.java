package ru.students.simple_rest_db.service;

import org.springframework.stereotype.Service;
import ru.students.simple_rest_db.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> lastStudents();
    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
