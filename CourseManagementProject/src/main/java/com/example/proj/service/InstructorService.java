package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import com.example.proj.entity.Instructor;

public interface InstructorService {
	public List<Instructor> getAll();
	public Optional<Instructor> getId(int id);
	public Instructor save(Instructor instructor);
	public Instructor update(Instructor instructor);
	public void deleteById(int id );
}
