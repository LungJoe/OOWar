package Models;

import java.util.ArrayList;

public class WarTwoPlayer extends War{
    Pile discardPile;
    Deck deck;
    Player playerOne;
    Player playerTwo;
    Card playerOneCard;
    Card playerTwoCard;
    

    public WarTwoPlayer(Player playerOne, Player playerTwo, Deck deck) {
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
    	discardPile = new Pile();
    	this.deck = deck;
    }

    public void playGame() {
	boolean stillPlaying = true;
    	while(stillPlaying) {
    	    playerOneCard = playerOne.getNextCard();
    	    playerTwoCard = playerTwo.getNextCard();
    	    
    	}
    }
    
    public void setPlayerDecks() {
	playerOne.setDeck(deck.split());
	playerTwo.setDeck(deck);
    }
    
    public void war() {
    	
    	//needs more logic
    }

    
}
