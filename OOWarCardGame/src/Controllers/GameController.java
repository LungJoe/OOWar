package Controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import View.Logger;

public class GameController {
	public DeckController deckController;
	public BufferedReader playerInput;
	public Logger logger;
	public static String name = null;
	
	public GameController(){
		deckController = new DeckController();
		playerInput = new BufferedReader(new InputStreamReader(System.in));
		logger = new Logger();
	}
}
