package com.server.golf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.golf.domain.entity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
	@Override
	List<Tournament> findAll();

	Tournament findByName(final String name);
}