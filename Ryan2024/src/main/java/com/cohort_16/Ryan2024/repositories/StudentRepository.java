package com.cohort_16.Ryan2024.repositories;

import com.cohort_16.Ryan2024.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}