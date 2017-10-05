package Controllers;

import java.io.IOException;

import Models.Card;
import View.*;

public class Game3Controller extends GameController {
	
	public Deck3Controller deckController;
	public LoggerThreePlayer logger;
	public int player3Score = 0;
	
	public Game3Controller(){
		logger = new LoggerThreePlayer();
		deckController = new Deck3Controller();
	}
	
	public void inputPlayerNames(){
		System.out.print("Enter Player 1 name: ");
		try {
			name = playerInput.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		deckController.player1.setPlayerName(name);
		
		System.out.print("Enter Player 2 name: ");
		try {
			name = playerInput.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		deckController.player2.setPlayerName(name);
		
		System.out.print("Enter Player 3 name: ");
		try {
			name = playerInput.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		deckController.player3.setPlayerName(name);
	}
	
	public void playGame(){
		while((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player3.getPlayerDeck().cards.isEmpty())){
			playRound(0);
		}
		logger.logWin(this);
	}
	
	public void playRound(int points){
		Card cardPlayer1 = null, cardPlayer2 = null, cardPlayer3 = null;
		if((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player3.getPlayerDeck().cards.isEmpty()))
		{
			points += 3;
			cardPlayer1 = deckController.player1.getPlayerDeck().cards.remove(0);
			cardPlayer2 = deckController.player2.getPlayerDeck().cards.remove(0);
			cardPlayer3 = deckController.player3.getPlayerDeck().cards.remove(0);
			if((cardPlayer1.getValue() > cardPlayer2.getValue()) && (cardPlayer1.getValue() > cardPlayer3.getValue()))
			{
				player1Score += points;
				deckController.player1.getPlayerDeck().cards.addAll(winPile.cards);
				winPile.cards.clear();
			}
			if((cardPlayer2.getValue() > cardPlayer1.getValue()) && (cardPlayer2.getValue() > cardPlayer3.getValue()))
			{
				player2Score += points;
				deckController.player2.getPlayerDeck().cards.addAll(winPile.cards);
				winPile.cards.clear();
			}
			if((cardPlayer3.getValue() > cardPlayer1.getValue()) && (cardPlayer3.getValue() > cardPlayer2.getValue()))
			{
				player3Score += points;
				deckController.player3.getPlayerDeck().cards.addAll(winPile.cards);
				winPile.cards.clear();
			}
			if(((cardPlayer1.getValue() == cardPlayer2.getValue()) && (cardPlayer1.getValue() == cardPlayer3.getValue())) ||
					((cardPlayer1.getValue() == cardPlayer2.getValue()) && (cardPlayer1.getValue() > cardPlayer3.getValue())) ||
					((cardPlayer1.getValue() == cardPlayer3.getValue()) && (cardPlayer1.getValue() > cardPlayer2.getValue())) ||
					((cardPlayer2.getValue() == cardPlayer3.getValue()) && (cardPlayer2.getValue() > cardPlayer1.getValue())))
			{
				winPile.cards.add(cardPlayer1);
				winPile.cards.add(cardPlayer2);
				winPile.cards.add(cardPlayer3);
				logger.logRound(deckController, cardPlayer1, cardPlayer2, cardPlayer3);
				if((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
						(!deckController.player2.getPlayerDeck().cards.isEmpty()) &&
						(!deckController.player3.getPlayerDeck().cards.isEmpty()))
				{
					winPile.cards.add(deckController.player1.getPlayerDeck().cards.remove(0));
					winPile.cards.add(deckController.player2.getPlayerDeck().cards.remove(0));
					winPile.cards.add(deckController.player3.getPlayerDeck().cards.remove(0));
					points += 3;
					playRound(points);
				}
			}
			else {
			logger.logRound(deckController, cardPlayer1, cardPlayer2, cardPlayer3);
			logger.logScore(this);
			}
		}
	}
}
