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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "hole")
public class Hole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	protected long id;
	
	@Size(min=1, max=18)
	protected int holeNum;
	
	@NotNull
	@Size(min=3, max=5)
	protected int par;	

	@Column
	protected int strokes;
	
	@ManyToMany(mappedBy = "holes")
	@JsonIgnore
	protected List<Tournament> tournamentHole = new ArrayList<>();
}
