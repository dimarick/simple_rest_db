package ru.students.simple_rest_db.controller;

import org.springframework.web.bind.annotation.*;
import ru.students.simple_rest_db.entity.Student;
import ru.students.simple_rest_db.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsController {
    private final StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/students")
    public List<Student> list()
    {
        return studentService.lastStudents();
    }

    @GetMapping(value = "/students/{id}")
    public Student get(@PathVariable("id") int id)
    {
        return studentService.getStudent(id);
    }

    @PostMapping(value = "/students")
    public Student create(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @PutMapping(value = "/students")
    public Student update(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @DeleteMapping(value = "/students/{id}")
    public void delete(@PathVariable("id") int id)
    {
        studentService.deleteStudent(id);
    }
}
