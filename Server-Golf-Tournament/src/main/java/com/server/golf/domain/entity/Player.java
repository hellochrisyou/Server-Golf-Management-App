package com.server.golf.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	protected long id;
	
	protected String name;
	
	protected String gender;
	
	protected int age;
	
	protected String city;
	 
	protected String state;
	
	protected float handicap;	
	
	@ManyToMany(mappedBy = "players")
	@JsonIgnore
	protected List<Tournament> tournamentPlayer = new ArrayList<>();
}
