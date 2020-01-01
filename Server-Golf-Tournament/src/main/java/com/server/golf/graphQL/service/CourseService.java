package com.server.golf.graphQL.service;

import com.server.golf.domain.entity.Course;

public interface CourseService {

	public void addCourse(Course course);
	public void updateCourse(Course course);
	public void deleteCourse(Course course);
}
