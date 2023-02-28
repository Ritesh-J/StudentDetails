package com.details.student.identity.service;

import com.details.student.identity.model.Student;
import com.details.student.identity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String studentSave(Student student) {
        Student saveDetails=studentRepository.save(student);
        return "New Details Created "+ saveDetails;
    }

    public List<Student> studentFindAll() {
        return studentRepository.findAll();
    }

    public Student studentFindById(int id) {
        return studentRepository.findById(id);
    }




}
