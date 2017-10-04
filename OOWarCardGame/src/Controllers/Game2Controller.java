package Controllers;

import java.io.IOException;

import Models.Card;

public class Game2Controller extends GameController {

	public Game2Controller(){
		deckController = new DeckController();
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
		deckController.dealDeck();
		while((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty())){
			playRound(0);
		}
		logger.logWin(this);
	}
	
	public void playRound(int points){
		Card cardPlayer1, cardPlayer2;
		if((!deckController.player1.getPlayerDeck().cards.isEmpty()) &&
				(!deckController.player2.getPlayerDeck().cards.isEmpty()))
		{
			points += 2;
			cardPlayer1 = deckController.player1.getPlayerDeck().cards.remove(0);
			cardPlayer2 = deckController.player2.getPlayerDeck().cards.remove(0);
			//System.out.println(cardPlayer1.getValue() + " " + cardPlayer2.getValue());
			if(cardPlayer1.getValue() < cardPlayer2.getValue())
				player2Score += points;
			if(cardPlayer1.getValue() > cardPlayer2.getValue())
				player1Score += points;
			if(cardPlayer1.getValue() == cardPlayer2.getValue()){
				cardPlayer1 = deckController.player1.getPlayerDeck().cards.remove(0);
				cardPlayer2 = deckController.player2.getPlayerDeck().cards.remove(0);
				points += 2;
				//logger.logRound(deckController, cardPlayer1, cardPlayer2);
				playRound(points);
			}	
			logger.logRound(deckController, cardPlayer1, cardPlayer2);
			logger.logScore((Game2Controller)this);
		}
	}
}
