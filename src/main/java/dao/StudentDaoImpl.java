package dao;

import service.model.Student;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
@Local({StudentDao.class})
public class StudentDaoImpl implements StudentDao {
    @PersistenceContext(unitName = "defaultDB")
    EntityManager entityManager;
    @Override
    public void add(Student student) {
        entityManager.persist(student);
    }

    @Override
    public List<Student> list() {
        return entityManager.createNamedQuery("Student.list").getResultList();
    }

}
