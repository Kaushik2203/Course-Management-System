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

import com.example.proj.entity.Course;
import com.example.proj.service.CourseService;

@RestController
@RequestMapping("/cms/api")
public class CourseRestController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseService.getAll();
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> getCourseById(@PathVariable("id") int cid) {
		
	return courseService.getById(cid);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.update(course);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.add(course);
	}
	
	@DeleteMapping("/courses")
	public String deleteCourseById(@PathVariable("id") int cid) {
		 courseService.deleteById(cid);
		 return "Course with "+cid+" deleted successfully";
	}

}
