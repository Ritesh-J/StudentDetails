package com.details.student.identity.controller;

import com.details.student.identity.model.Student;
import com.details.student.identity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping ("/student/save")
    public String saveDetails(@RequestBody Student payload) {
        return studentService.studentSave(payload);
    }

    @RequestMapping("/student")
    public List<Student> findDetails() {
        return studentService.studentFindAll();
    }

    @RequestMapping("/student/{id}")
    public Student findDetailsById(@PathVariable("id") int id) {
        return studentService.studentFindById(id);
    }

}
