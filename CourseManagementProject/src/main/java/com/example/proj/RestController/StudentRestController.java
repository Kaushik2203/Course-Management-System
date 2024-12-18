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

import com.example.proj.entity.Student;
import com.example.proj.service.StudentService;

@RestController
@RequestMapping("/cms/api")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAll();
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") int sid) {
		return studentService.getById(sid);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.update(student);
		
	}
	
	@PostMapping("/students")
	public Student AddStudent(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@DeleteMapping("/students/{id}")
	public  String deleteStudentById(@PathVariable("id") int sid) {
		studentService.deleteById(sid);
		return "Student with "+ sid +" deleted Successfully";
	}

}
