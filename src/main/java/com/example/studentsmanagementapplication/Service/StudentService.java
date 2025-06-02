package com.example.studentsmanagementapplication.Service;

import com.example.studentsmanagementapplication.Entity.Student;

import java.util.List;


public interface StudentService {

    public boolean saveStudent(Student s);

    public List<Student> getAllStudents();

    public void delete(Integer sid);


}
