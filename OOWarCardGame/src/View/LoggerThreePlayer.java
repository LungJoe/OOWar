package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Controllers.*;
import Models.Card;

public class LoggerThreePlayer implements Logger{
	public BufferedReader playerInput;
	public int gameType;
	
	public LoggerThreePlayer(){
		playerInput = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void logRound(Deck3Controller deckController, Card cardPlayer1, Card cardPlayer2, Card cardPlayer3){
		System.out.println(deckController.player1.getPlayerName() + " plays " + cardPlayer1.toString() + " as up card");
		System.out.println(deckController.player2.getPlayerName() + " plays " + cardPlayer2.toString() + " as up card");
		System.out.println(deckController.player3.getPlayerName() + " plays " + cardPlayer3.toString() + " as up card");
		if((cardPlayer1.getValue() > cardPlayer2.getValue()) && (cardPlayer1.getValue() > cardPlayer3.getValue())){
			System.out.println(deckController.player1.getPlayerName() + " wins the round!");
		}
		if((cardPlayer2.getValue() > cardPlayer1.getValue()) && (cardPlayer2.getValue() > cardPlayer3.getValue())){
			System.out.println(deckController.player2.getPlayerName() + " wins the round!");
		}
		if((cardPlayer3.getValue() > cardPlayer1.getValue()) && (cardPlayer3.getValue() > cardPlayer2.getValue())){
			System.out.println(deckController.player3.getPlayerName() + " wins the round!");
		}
		if(((cardPlayer1.getValue() == cardPlayer2.getValue()) && (cardPlayer1.getValue() == cardPlayer3.getValue())) ||
				((cardPlayer1.getValue() == cardPlayer2.getValue()) && (cardPlayer1.getValue() > cardPlayer3.getValue())) ||
				((cardPlayer1.getValue() == cardPlayer3.getValue()) && (cardPlayer1.getValue() > cardPlayer2.getValue())) ||
				((cardPlayer2.getValue() == cardPlayer3.getValue()) && (cardPlayer2.getValue() > cardPlayer1.getValue())))
		{
			System.out.println("WAR!");
		}
	}
	
	public void logScore(GameController gameController){
		System.out.println("Score is " + ((Game3Controller)gameController).deckController.player1.getPlayerName() + " " +
				((Game3Controller)gameController).player1Score + ", " + ((Game3Controller)gameController).deckController.player2.getPlayerName() + " " + ((Game3Controller)gameController).player2Score +
				", " + ((Game3Controller)gameController).deckController.player3.getPlayerName() + " " + ((Game3Controller)gameController).player3Score);
	}
			
	
	public void logWin(GameController gameController){
		if((((Game3Controller)gameController).player1Score > ((Game3Controller)gameController).player2Score) && (((Game3Controller)gameController).player1Score > ((Game3Controller)gameController).player3Score))
			System.out.println(((Game3Controller)gameController).deckController.player1.getPlayerName() + " wins!");
		if((((Game3Controller)gameController).player2Score > ((Game3Controller)gameController).player1Score) && (((Game3Controller)gameController).player2Score > ((Game3Controller)gameController).player3Score))
			System.out.println(((Game3Controller)gameController).deckController.player2.getPlayerName() + " wins!");
		if((((Game3Controller)gameController).player3Score > ((Game3Controller)gameController).player1Score) && (((Game3Controller)gameController).player3Score > ((Game3Controller)gameController).player2Score))
			System.out.println(((Game3Controller)gameController).deckController.player3.getPlayerName() + " wins!");
		
		if((((Game3Controller)gameController).player1Score == ((Game3Controller)gameController).player2Score) && (((Game3Controller)gameController).player1Score > ((Game3Controller)gameController).player3Score))
			System.out.println(((Game3Controller)gameController).deckController.player1.getPlayerName() + " and " + ((Game3Controller)gameController).deckController.player2.getPlayerName() + " tie!");
		if((((Game3Controller)gameController).player1Score == ((Game3Controller)gameController).player3Score) && (((Game3Controller)gameController).player1Score > ((Game3Controller)gameController).player2Score))
			System.out.println(((Game3Controller)gameController).deckController.player1.getPlayerName() + " and " + ((Game3Controller)gameController).deckController.player3.getPlayerName() + " tie!");
		if((((Game3Controller)gameController).player2Score == ((Game3Controller)gameController).player3Score) && (((Game3Controller)gameController).player2Score > ((Game3Controller)gameController).player1Score))
			System.out.println(((Game3Controller)gameController).deckController.player2.getPlayerName() + " and " + ((Game3Controller)gameController).deckController.player3.getPlayerName() + " tie!");
		
		if((((Game3Controller)gameController).player1Score == ((Game3Controller)gameController).player2Score) && (((Game3Controller)gameController).player1Score == ((Game3Controller)gameController).player3Score))
			System.out.println("Tie Game!");
	}

	@Override
	public void logRound(DeckController deckController, Card cardPlayer1, Card cardPlayer2) {
		// TODO Auto-generated method stub
		
	}
}
