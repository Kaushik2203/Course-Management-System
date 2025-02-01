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

import com.example.cms.entity.Course;
import com.example.cms.service.CourseService;

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
	public Optional<Course> getCourseById(@PathVariable("id") Long cid){
		return courseService.getId(cid);
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.save(course);
	}
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.update(course);
	}
	@DeleteMapping("/courses/{id}")
	public String deleteCourse(@PathVariable("id") Long cid) {
		courseService.deleteById(cid);
		return "Course with Id= "+cid+" Deleted Sucessfully";
	}
	
}
