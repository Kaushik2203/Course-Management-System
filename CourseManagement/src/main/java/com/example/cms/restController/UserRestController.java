package com.example.cms.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.entity.User;
import com.example.cms.service.UserService;

@RestController
@RequestMapping("/cms/api")
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.getAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long uid) {
		return userService.getById(uid);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.add(user);
	}
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return userService.update(user);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") Long uid) {
		userService.delete(uid);
		return "User deleted Sucessfully with Id Number"+uid;
	}
	
}
