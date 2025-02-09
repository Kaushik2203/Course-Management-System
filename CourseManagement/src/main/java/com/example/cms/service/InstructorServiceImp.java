package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.Repository.InstructorRepository;
import com.example.cms.Repository.UserRepository;
import com.example.cms.entity.Instructor;
import com.example.cms.entity.User;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class InstructorServiceImp implements InstructorService{
	
	@Autowired
	private InstructorRepository instructorRepo;
	
	@Autowired
	private UserRepository userRepo;

	
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
        if (instructor.getUser() == null || instructor.getUser().getId() == null) {
            throw new IllegalArgumentException("Instructor must be linked to a valid User.");
        }

        // Fetch the latest User from DB to avoid stale state errors
        User user = userRepo.findById(instructor.getUser().getId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        
        instructor.setUser(user); // Ensure association with an up-to-date user

        return instructorRepo.saveAndFlush(instructor);
    }

    @Override
    public Instructor update(Instructor instructor) {
        // Fetch the existing instructor before updating to prevent stale object issues
        Instructor existingInstructor = instructorRepo.findById(instructor.getId())
                .orElseThrow(() -> new IllegalArgumentException("Instructor not found"));

        existingInstructor.setQualification(instructor.getQualification());
        existingInstructor.setExpertise(instructor.getExpertise());
        existingInstructor.setBio(instructor.getBio());

        return instructorRepo.saveAndFlush(existingInstructor);
    }

	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		instructorRepo.deleteById(id);
		
		
	}

}

