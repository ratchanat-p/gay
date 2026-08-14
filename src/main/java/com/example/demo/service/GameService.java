package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.repository.GameRepository;

@Service
public class GameService {
	private final GameRepository gameRepository;

	public GameService(GameRepository gameRepository) {
		super();
		this.gameRepository = gameRepository;
	}

	public GameRepository getGameRepository() {
		return gameRepository;
	}
}
