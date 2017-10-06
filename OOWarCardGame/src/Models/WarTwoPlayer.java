package Models;

public class WarTwoPlayer extends War {
    Pile discardPile;
    Deck deck;
    Player playerOne;
    Player playerTwo;
    Card playerOneCard;
    Card playerTwoCard;
    Printer printer;

    public WarTwoPlayer(Player playerOne, Player playerTwo, Deck deck) {
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
	discardPile = new Pile();
	this.deck = deck;
	//this.printer = new Printer();
    }

    public void playGame() {
	while (playerOne.stillHasCards() && playerTwo.stillHasCards()) {
	    setUpRound();
	    determineRoundWinner().addCardsToDeck(discardPile.getPile());
	    discardPile.clearPile();
	}
    }

    public void setPlayerDecks() {
	playerOne.setDeck(deck.split());
	playerTwo.setDeck(deck);
    }

    public void war() {

	System.out.println("WAR!");
	setUpWar();
	determineRoundWinner().addCardsToDeck(discardPile.getPile());
	discardPile.clearPile();
    }

    public void setUpRound() {
	playerOneCard = playerOne.getNextCard();
	playerTwoCard = playerTwo.getNextCard();
	discardPile.addOntoPile(playerOneCard);
	discardPile.addOntoPile(playerTwoCard);
	
    }
    
    public void setUpWar() {
	discardPile.addOntoPile(playerOne.getNextCard());
	discardPile.addOntoPile(playerTwo.getNextCard());
	setUpRound();
    }

    public Player determineRoundWinner() {
	if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 1) {
	    System.out.printf("%s wins with %s over %s\n", playerOne.getName(), playerOneCard, playerTwoCard);
	    playerOne.addCardsToDeck(playerOneCard, playerTwoCard);
	} else if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 2) {
	    System.out.printf("%s wins with %s over %s\n", playerTwo.getName(), playerTwoCard, playerOneCard);
	    playerTwo.addCardsToDeck(playerOneCard, playerTwoCard);
	} else {
	    war();
	}
	return playerOne;
    }

}
