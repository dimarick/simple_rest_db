package ru.students.simple_rest_db.service;

import org.springframework.stereotype.Service;
import ru.students.simple_rest_db.dao.StudentDAO;
import ru.students.simple_rest_db.entity.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> lastStudents() {
        return this.studentDAO.listStudents();
    }

    @Override
    public Student getStudent(int id) {
        return this.studentDAO.getStudent(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return this.studentDAO.saveStudent(student);

    }

    @Override
    public void deleteStudent(int id) {
        this.studentDAO.deleteStudent(id);
    }
}
