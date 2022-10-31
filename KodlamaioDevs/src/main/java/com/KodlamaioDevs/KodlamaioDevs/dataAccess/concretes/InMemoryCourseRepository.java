package com.KodlamaioDevs.KodlamaioDevs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.KodlamaioDevs.KodlamaioDevs.dataAccess.abstracts.CourseRepository;
import com.KodlamaioDevs.KodlamaioDevs.entities.concretes.Course;

@Repository
public class InMemoryCourseRepository implements CourseRepository {
	
	List<Course> courses;
	
	public InMemoryCourseRepository() {
		courses = new ArrayList<Course>();
		
		courses.add(new Course(1,"Java"));
		courses.add(new Course(2,"C#"));
		courses.add(new Course(3,"JavaScript"));
	}
	
	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courses;
	}
	
	public void add(Course course) {
		courses.add(course);
	}
	
	public void delete(int id) {
		courses.remove(id);
	}
	
	public void update(Course course) {
		courses.set(5, course);
	}
	
	public Course getById (int id) {
		return courses.get(id);
	}
}