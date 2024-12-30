package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.Repository.InstructorRepository;
import com.example.cms.entity.Instructor;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class InstructorServiceImp implements InstructorService{
	
	@Autowired
	private InstructorRepository instructorRepo;
	
	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return instructorRepo.findAll();
	}

	@Override
	public Optional<Instructor> getId(Long id) {
		// TODO Auto-generated method stub
		return instructorRepo.findById(id);
	}

	@Override
	public Instructor save(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorRepo.save(instructor);
	}

	@Override
	public Instructor update(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorRepo.save(instructor);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		instructorRepo.deleteById(id);
		
		
	}

}