package com.server.golf.convert;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.server.golf.command.CourseForm;
import com.server.golf.domain.Course;

public class CourseFormToCourse implements Converter<CourseForm, Course> {

	    @Override
	    public Course convert(CourseForm courseForm) {
	        Course course = new Course();
	        if (courseForm.getId() != null  && !StringUtils.isEmpty(courseForm.getId())) {
	            course.set_id(new ObjectId(courseForm.getId()));
	        }
	        course.setCity(courseForm.getCity());
	        course.setDistance(courseForm.getDistance());
	        course.setEmail(courseForm.getEmail());
	        course.setManager(courseForm.getManager());
	        course.setName(courseForm.getName());
	        course.setPhoneNum(courseForm.getPhoneNum());
	        course.setRules(courseForm.getRules());
	        course.setState(courseForm.getState());
	        course.setDescription(courseForm.getDescription());
	        return course;
	    }
}
