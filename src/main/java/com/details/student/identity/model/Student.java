package com.details.student.identity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String studentName;
    private String studentDescription;

    public Student(int id, String studentName, String studentDescription) {
        this.id = id;
        this.studentName = studentName;
        this.studentDescription = studentDescription;
    }

    public Student() {
        this.id=0;
        this.studentName="";
        this.studentDescription="";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentDescription='" + studentDescription + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDescription() {
        return studentDescription;
    }

    public void setStudentDescription(String studentDescription) {
        this.studentDescription = studentDescription;
    }
}
