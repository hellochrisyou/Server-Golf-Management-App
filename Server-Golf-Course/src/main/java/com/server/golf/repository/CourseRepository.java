package com.server.golf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.golf.domain.Course;

public interface CourseRepository extends JpaRepository<Course, String> {
	@Override
	List<Course> findAll();

	Course findByName(final String name);
}