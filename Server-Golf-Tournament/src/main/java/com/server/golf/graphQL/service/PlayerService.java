package com.server.golf.graphQL.service;

import com.server.golf.domain.entity.Player;

public interface PlayerService {

	public void addPlayer(Player player);
	public void updatePlayer(Player player);
	public void deletePlayer(Player player);
}
