package com.example.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proj.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
