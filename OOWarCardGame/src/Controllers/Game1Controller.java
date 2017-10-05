package Controllers;

import java.io.IOException;

import Models.*;
import View.*;

public class Game1Controller extends GameController {
	public LoggerTwoPlayer logger;
	
	public Game1Controller(){
		deckController = new DeckController();
		logger = new LoggerTwoPlayer();
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
	}
	
	public void playGame(){
		while((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()))
		{
			playRound();
		}
		logger.logWin(this);
	}
	
	public void playRound(){
		Card cardPlayer1 = null, cardPlayer2 = null;
		// if player1 deck is not empty or player2 deck is not empty
		if((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()))
		{
			if((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()))
			{
				cardPlayer1 = deckController.player1.getPlayerDeck().cards.remove(0);
				cardPlayer2 = deckController.player2.getPlayerDeck().cards.remove(0);
			}
			if(cardPlayer1.getValue() < cardPlayer2.getValue())
			{
				winPile.cards.add(cardPlayer1);
				winPile.cards.add(cardPlayer2);
				winPile.shuffleDeck();
				deckController.player2.getPlayerDeck().cards.addAll(winPile.cards);
				winPile.cards.clear();
			}
			if(cardPlayer1.getValue() > cardPlayer2.getValue())
			{
				winPile.cards.add(cardPlayer1);
				winPile.cards.add(cardPlayer2);
				winPile.shuffleDeck();
				deckController.player1.getPlayerDeck().cards.addAll(winPile.cards);
				winPile.cards.clear();
			}
			if(cardPlayer1.getValue() == cardPlayer2.getValue())
			{
				winPile.cards.add(cardPlayer1);
				winPile.cards.add(cardPlayer2);
				logger.logRound(deckController, cardPlayer1, cardPlayer2);
				if((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
						(!deckController.player2.getPlayerDeck().cards.isEmpty()))
				{
					winPile.cards.add(deckController.player1.getPlayerDeck().cards.remove(0));
					winPile.cards.add(deckController.player2.getPlayerDeck().cards.remove(0));
					winPile.shuffleDeck();
				}
				playRound();
			}
			else
			{
				player1Score = deckController.player1.getPlayerDeck().cards.size();
				player2Score = deckController.player2.getPlayerDeck().cards.size();
				logger.logRound(deckController, cardPlayer1, cardPlayer2);
			}
		}
	}
}
