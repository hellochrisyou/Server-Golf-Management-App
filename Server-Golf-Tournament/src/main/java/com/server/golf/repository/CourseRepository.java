package com.server.golf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.golf.domain.entity.Course;
import com.server.golf.domain.entity.Player;

public interface CourseRepository extends JpaRepository<Course, Long> {
	@Override
	List<Course> findAll();

	Course findByName(final String name);

}
