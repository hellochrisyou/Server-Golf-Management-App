package com.server.golf.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.golf.command.CourseForm;
import com.server.golf.convert.CourseFormToCourse;
import com.server.golf.domain.Course;
import com.server.golf.repository.CourseRepository;
import com.server.golf.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	private CourseRepository courseRepository;
    private CourseFormToCourse courseFormToCourse;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository, CourseFormToCourse courseFormtoCourse) {
        this.courseRepository = courseRepository;
        this.courseFormToCourse = courseFormtoCourse;
    }


    @Override
    public List<Course> listAll() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add); //fun with Java 8
        return courses;
    }

    @Override
    public Course getById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course saveOrUpdate(Course course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public void delete(String id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course saveOrUpdateProductForm(CourseForm courseForm) {
    	Course savedCourse = saveOrUpdate(courseFormToCourse.convert(courseForm));

        System.out.println("Saved Account Id: " + savedCourse.get_id());
        return savedCourse;
    }
}
