package com.example.cms.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFirstName(String firstname);
	
	List<User> findByLastName(String lastname);
	
}
