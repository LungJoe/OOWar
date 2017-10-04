package Models;

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
	//boolean stillPlaying = true;
	int testIterations = 0;
    	while(testIterations < 20) {
    	    playerOneCard = playerOne.getNextCard();
    	    playerTwoCard = playerTwo.getNextCard();
    	    if(CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 1) {
    		System.out.printf("%s wins with %s over %s\n", playerOne.getName(), playerOneCard, playerTwoCard );
    	    } else if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 2) {
    		System.out.printf("%s wins with %s over %s\n", playerTwo.getName(), playerTwoCard, playerOneCard );    	    
    	    } else {
    		war();
    	    }
    	    //stillPlaying = false;
    	    testIterations += 1;
    	}
    }
    
    public void setPlayerDecks() {
	playerOne.setDeck(deck.split());
	playerTwo.setDeck(deck);
    }
    
    public void war() {
    	System.out.println("WAR");
    	//needs more logic
    }

    
}
