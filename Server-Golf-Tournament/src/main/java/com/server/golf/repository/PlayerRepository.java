package com.server.golf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.golf.domain.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
	@Override
	List<Player> findAll();

	Player findByName(final String name);
}