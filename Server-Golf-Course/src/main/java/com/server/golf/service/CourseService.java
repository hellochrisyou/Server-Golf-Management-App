package com.server.golf.service;

import java.util.List;

import com.server.golf.command.CourseForm;
import com.server.golf.domain.Course;

public interface CourseService {

	List<Course> listAll();

    Course getById(String id);

    Course saveOrUpdate(Course curse);

    void delete(String id);

    Course saveOrUpdateProductForm(CourseForm courseForm);
}