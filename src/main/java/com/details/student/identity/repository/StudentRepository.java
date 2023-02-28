package com.details.student.identity.repository;

import com.details.student.identity.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    public List<Student> findAll();
    public Student findById(int id);
    public Student save(Student student);
    public void deleteById(int id);


}
