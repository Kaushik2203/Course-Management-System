package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj.Repository.StudentRepository;
import com.example.proj.entity.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studRepo.findAll();
	}

	@Override
	public Optional<Student> getById(int id) {
		// TODO Auto-generated method stub
		return studRepo.findById(id);
	}

	@Override
	public Student save(Student stud) {
		// TODO Auto-generated method stub
		return studRepo.save(stud);
	}

	@Override
	public Student update(Student stud) {
		// TODO Auto-generated method stub
		return studRepo.save(stud);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studRepo.deleteById(id);
	}

}
