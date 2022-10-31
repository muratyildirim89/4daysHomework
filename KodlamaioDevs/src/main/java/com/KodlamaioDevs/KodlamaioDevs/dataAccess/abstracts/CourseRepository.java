package com.KodlamaioDevs.KodlamaioDevs.dataAccess.abstracts;

import java.util.List;

import com.KodlamaioDevs.KodlamaioDevs.entities.concretes.Course;

public interface CourseRepository {

	public void add(Course course);
	public void update(Course course);
	public void delete(int id);
	public Course getById(int id);
	public List<Course> getAll();
}
