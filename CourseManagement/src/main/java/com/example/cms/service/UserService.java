package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import com.example.cms.entity.User;

public interface UserService {
	
	public List<User> getAll();
	public Optional<User> getById(Long id);
	public User add(User user);
	public User update(User user);
	public void delete(Long id);
	
}
