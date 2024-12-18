package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj.Repository.UserRepository;
import com.example.proj.entity.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

}
