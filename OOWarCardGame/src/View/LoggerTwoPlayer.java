package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Controllers.DeckController;
import Controllers.GameController;
import Models.Card;

public class LoggerTwoPlayer implements Logger{

	public BufferedReader playerInput;
	public int gameType;
	
	public LoggerTwoPlayer(){
		playerInput = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int pickMaxNumberOfIterations(){
		int numberOfIterations = 0;
		
		System.out.print("Enter max number of iterations: ");
		
		try {
			numberOfIterations = Integer.parseInt(playerInput.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(numberOfIterations < 1) 
		{
			System.err.print("Please enter a valid number of iterations\n");
			pickMaxNumberOfIterations();
		}
		
		return numberOfIterations;
	}
	
	public void logRound(DeckController deckController, Card cardPlayer1, Card cardPlayer2){
		System.out.println(deckController.player1.getPlayerName() + " plays " + cardPlayer1.toString() + " as up card");
		System.out.println(deckController.player2.getPlayerName() + " plays " + cardPlayer2.toString() + " as up card");
		if(cardPlayer1.getValue() < cardPlayer2.getValue()){
			System.out.println(deckController.player2.getPlayerName() + " wins the round!");
		}
		if(cardPlayer1.getValue() > cardPlayer2.getValue()){
			System.out.println(deckController.player1.getPlayerName() + " wins the round!");
		}
		if(cardPlayer1.getValue() == cardPlayer2.getValue()){
			System.out.println("WAR!");
		}
	}
	
	public void logScore(GameController gameController){
		System.out.println("Score is " + gameController.deckController.player1.getPlayerName() + " " +
				gameController.player1Score + ", " + gameController.deckController.player2.getPlayerName() + " " + gameController.player2Score);
	}
	
	public void logWin(GameController gameController){
		if(gameController.player1Score < gameController.player2Score)
			System.out.println(gameController.deckController.player2.getPlayerName() + " wins!");
		if(gameController.player1Score > gameController.player2Score)
			System.out.println(gameController.deckController.player1.getPlayerName() + " wins!");
		if(gameController.player1Score == gameController.player2Score)
			System.out.println("Tie Game!");
	}
}
