package ru.students.simple_rest_db.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ru.students.simple_rest_db.entity.Student;

import java.util.List;

@Slf4j
@Repository
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> listStudents() {
        var query = entityManager.createQuery("from Student", Student.class);

        List<Student> list = query.getResultList();

        log.info("listStudents: " + list);

        return list;
    }

    @Override
    public Student getStudent(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        entityManager
            .createQuery("delete from Student where id = :studentId")
            .setParameter("studentId", id)
            .executeUpdate();
    }
}
