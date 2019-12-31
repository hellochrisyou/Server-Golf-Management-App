package com.server.golf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.golf.domain.entity.Hole;

public interface HoleRepository extends JpaRepository<Hole, Long> {
		@Override
		List<Hole> findAll();

		Hole findByName(final String name);
	}
}
