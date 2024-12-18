package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import com.example.proj.entity.Student;

public interface StudentService {
	public List<Student> getAll();
	public Optional<Student> getById(int id);
	public Student save(Student stud);
	public Student update(Student stud);
	public void deleteById(int id );
}
