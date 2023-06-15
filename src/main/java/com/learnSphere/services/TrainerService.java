package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;


public interface TrainerService  {

	public String addCourse(Course course);

	public String addLesson(Lesson lesson);
	
	public Course getCourse(Integer courseId);
	
	public List<Course> courseList();
}