package com.learnSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Lesson;
import com.learnSphere.repository.LessonRepository;

@Service
public class StudentServicesImplementation implements StudentServices{

	@Autowired
	LessonRepository lessonRepo;
	@Override
	public Lesson getLesson(int lessonId) {
		
		return lessonRepo.findById(lessonId).get();
		
	}

}
