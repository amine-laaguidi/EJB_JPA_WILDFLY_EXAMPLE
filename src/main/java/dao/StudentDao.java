package dao;

import service.model.Student;

import jakarta.ejb.Local;

import java.util.List;

@Local
public interface StudentDao {
    void add(Student student);
    List<Student> list();
}
