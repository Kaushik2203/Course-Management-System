package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import com.example.proj.entity.Course;

public interface CourseService {
	
	public List<Course> getAll();
	public Optional<Course> getById(int id);
	public Course add(Course course);
	public Course update(Course course);
	public void deleteById(int id);
	
}
