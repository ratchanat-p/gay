package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import com.example.demo.service.GameService;

@Controller
public class GameController {
	private final GameService gameService;

	public GameController(GameService gameService) {
		super();
		this.gameService = gameService;
	}
	
}
