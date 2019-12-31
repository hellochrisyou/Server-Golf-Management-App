package com.server.golf.domain;

import lombok.Data;

@Data
public class CourseDTO {
	protected String name;
	protected String city;
	protected String state;
	protected float length;
}
