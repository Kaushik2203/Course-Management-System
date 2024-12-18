package com.example.proj.service;

import java.util.List;
import java.util.Optional;

import com.example.proj.entity.User;

public interface UserService {
	public List<User> getAll();
	public Optional<User> getById(int id);
	public User add(User user);
	public User update(User user);
	public void delete(int id);
}
