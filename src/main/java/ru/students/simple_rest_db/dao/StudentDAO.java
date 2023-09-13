package ru.students.simple_rest_db.dao;

import org.springframework.stereotype.Repository;
import ru.students.simple_rest_db.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> listStudents();
    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
