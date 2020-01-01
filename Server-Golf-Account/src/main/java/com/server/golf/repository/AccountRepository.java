package com.server.golf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.golf.domain.Account;


public interface AccountRepository extends JpaRepository<Account, String> {
	@Override
	List<Account> findAll();

	Account findByName(final String name);
}