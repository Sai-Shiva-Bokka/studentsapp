package com.example.studentsmanagementapplication.Service;

import com.example.studentsmanagementapplication.Entity.Student;
import com.example.studentsmanagementapplication.Repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo=repo;
    }

    @Override
    public boolean saveStudent(Student s) {
        Student savedStudent = repo.save(s);
        return savedStudent.getSid() !=null;
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public void delete(Integer sid) {
        repo.deleteById(sid);
    }
}
