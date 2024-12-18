package com.example.proj.RestController;

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

import com.example.proj.entity.Instructor;
import com.example.proj.service.InstructorService;

@RestController
@RequestMapping("/cms/api")
public class InstructorRestController {
	
	@Autowired
	private InstructorService instructorService;
	
	@GetMapping("/instructors")
	public List<Instructor> getAllInstructors(){
		return instructorService.getAll();
		
	}
	
	@GetMapping("/instructors/{id}")
	public Optional<Instructor>  getInstructorById(@PathVariable("id") int iid) {
		return instructorService.getId(iid);
	}

	@PutMapping("/instructors")
	public Instructor updateInstructor(@RequestBody Instructor instructor) {
		return instructorService.update(instructor);
	}
	
	@PostMapping("/instructors")
	public Instructor addInstructor(@RequestBody Instructor instructor) {
		return instructorService.save(instructor);
	}
	
	@DeleteMapping("/instructors/{id}")
	public String deleteInstructorById(@PathVariable("id") int iid) {
		instructorService.deleteById(iid);
		return "Instructor with "+iid+" deleted Successfully";
	}
}
