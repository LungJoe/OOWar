package Controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Models.Deck;
import View.Logger;

public class GameController {
	public BufferedReader playerInput;
	public DeckController deckController;
	public Logger logger;
	public static String name = null;
	public int player1Score = 0, player2Score = 0;
	public Deck winPile;
	
	public GameController(){
		playerInput = new BufferedReader(new InputStreamReader(System.in));
		winPile = new Deck();
	}
}
