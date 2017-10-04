package Controllers;

import java.io.IOException;

import Models.Card;

public class Game1Controller extends GameController {
	
	public Game1Controller(){
		
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
		Card cardPlayer1, cardPlayer2;
		while((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()))
		{
			cardPlayer1 = deckController.player1.getPlayerDeck().cards.remove(0);
			cardPlayer2 = deckController.player2.getPlayerDeck().cards.remove(0);
			logger.logRound(cardPlayer1, cardPlayer2);
		}
	}
}
