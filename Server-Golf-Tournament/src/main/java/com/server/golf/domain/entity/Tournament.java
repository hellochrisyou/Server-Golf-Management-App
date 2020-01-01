package com.server.golf.domain.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.server.golf.domain.Audit;

import lombok.Data;

@Entity
@Data
@Table(name = "tournament")
public class Tournament extends Audit implements Serializable {

	private static final long serialVersionUID = -3171081307974598508L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	protected long id;	 
	
	protected String name;
	protected String gameType;    
	protected float fee;
	protected String courseName;
    
    @ManyToMany(cascade = {
    	    CascadeType.PERSIST,
    	    CascadeType.MERGE
    	})
    	@JoinTable(name = "team_hole",
    	    joinColumns = @JoinColumn(name = "team_id"),
    	    inverseJoinColumns = @JoinColumn(name = "hole_id")
    	)
    	private List<Player> holes = new ArrayList<>();
    
    @ManyToMany(cascade = {
    	    CascadeType.PERSIST,
    	    CascadeType.MERGE
    	})
    	@JoinTable(name = "team_player",
    	    joinColumns = @JoinColumn(name = "team_id"),
    	    inverseJoinColumns = @JoinColumn(name = "player_id")
    	)
    	private List<Player> players = new ArrayList<>();
    
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Course> courses = new ArrayList<Course>();
}
