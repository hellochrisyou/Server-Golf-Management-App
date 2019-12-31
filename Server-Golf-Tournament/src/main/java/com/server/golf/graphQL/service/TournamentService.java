package com.server.golf.graphQL.service;

import com.server.golf.domain.entity.Tournament;

public interface TournamentService {
	
	public void addTourney(Tournament tourney);
	public void updateTourney(Tournament tourney);
	public void deleteTourney(Tournament tourney);
}
