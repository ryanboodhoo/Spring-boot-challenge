package com.cohort_16.Ryan2024.controllers;


import com.cohort_16.Ryan2024.models.Student;
import com.cohort_16.Ryan2024.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;
@RestController
public class StudentController {


    @Autowired
    StudentService studentService; // dependency Injection

    //Format JSON - JavaScript object notation

    @GetMapping("/students")
    public Iterable<Student> getListOfStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public void editStudent(@PathVariable Long id, @RequestBody Student student ){
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }


}