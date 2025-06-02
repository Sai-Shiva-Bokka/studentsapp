package com.example.studentsmanagementapplication.Controller;

import com.example.studentsmanagementapplication.Entity.Student;
import com.example.studentsmanagementapplication.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @PostMapping("/saveStudent")
    public ModelAndView handleSubmitBtn(Student s) {
        ModelAndView mav = new ModelAndView();
        boolean isSaved = service.saveStudent(s);

        if (isSaved) {
            mav.addObject("message", "Student Saved");
        } else {
            mav.addObject("message", "Student Not Saved");
        }
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/getData")
    public ModelAndView getStudentList() {
        List<Student> students = service.getAllStudents();
        ModelAndView mav = new ModelAndView();
        mav.addObject("students", students);
        mav.setViewName("students");
        return mav;
    }

    @GetMapping("/delete")
    public ModelAndView deleteRecord(@RequestParam("sid") Integer sid){
        service.delete(sid);
        List<Student> students = service.getAllStudents();
        ModelAndView mav = new ModelAndView();
        mav.addObject("students", students);
        mav.setViewName("students");
        return mav;
    }
}
