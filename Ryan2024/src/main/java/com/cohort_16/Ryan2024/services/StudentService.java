package com.cohort_16.Ryan2024.services;

import com.cohort_16.Ryan2024.models.Student;
import com.cohort_16.Ryan2024.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    //Business logic

    @Autowired
    StudentRepository studentRepository;

    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void updateStudent(Long id, Student student){
        Student studentOptional = studentRepository.findById(id).get();
        studentOptional.setAge(student.getAge());
        studentOptional.setName(student.getName());
        studentOptional.setHobbies(student.getHobbies());
        studentRepository.save(studentOptional);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }


}