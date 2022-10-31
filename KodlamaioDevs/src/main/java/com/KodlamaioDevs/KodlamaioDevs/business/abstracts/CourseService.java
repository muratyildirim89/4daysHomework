package com.KodlamaioDevs.KodlamaioDevs.business.abstracts;

import java.util.List;

import com.KodlamaioDevs.KodlamaioDevs.entities.concretes.Course;

public interface CourseService {
	public void add(Course course);
	public void delete(int id);
	public void update(Course course);
	public Course getById(int id);
	public List<Course> getAll();
}
