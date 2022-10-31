package com.KodlamaioDevs.KodlamaioDevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KodlamaioDevs.KodlamaioDevs.business.abstracts.CourseService;
import com.KodlamaioDevs.KodlamaioDevs.entities.concretes.Course;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	private CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@GetMapping("/getall")
	public List<Course> getAll(){
		return courseService.getAll();
	}
	
	@PostMapping("/add")
	public Course add() {
		courseService.add(new Course(5,"HTML"));
		return null;
	}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		courseService.delete(id);
	}
	
	@PostMapping("/update/{course}")
	public void update(@PathVariable("course") Course course) {
		courseService.update(course);
	}
	
	@GetMapping("/get/{id}")
	public Course getById(@PathVariable("id") int id) {
		return courseService.getById(id);
	}
}
