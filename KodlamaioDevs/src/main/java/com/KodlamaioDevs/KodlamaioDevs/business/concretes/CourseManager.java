package com.KodlamaioDevs.KodlamaioDevs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KodlamaioDevs.KodlamaioDevs.business.abstracts.CourseService;
import com.KodlamaioDevs.KodlamaioDevs.dataAccess.abstracts.CourseRepository;
import com.KodlamaioDevs.KodlamaioDevs.entities.concretes.Course;

@Service
public class CourseManager implements CourseService {

	private final CourseRepository courseRepository;
	
	@Autowired
	public CourseManager(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAll() {
		// iş kuralları
		return courseRepository.getAll();
	}
	
	@Override
	public void add(Course course) {		
		courseRepository.add(course);
	}

	@Override
	public void delete(int id) {
		courseRepository.delete(id);
	}

	@Override
	public void update(Course course) throws NullPointerException {
		if (course.getName().isEmpty())
		{
			throw new NullPointerException("Program adı boş bırakılamaz");
		}
		
		for(Course item : courseRepository.getAll())
		{
			if(item.getName().toLowerCase().equals(course.getName().toLowerCase()))
			{
				throw new NullPointerException("Kurs adı girilmiş");
			}
		}		
		courseRepository.update(course);
	}

	@Override
	public Course getById(int id) {
		return courseRepository.getById(id);
	}	
}