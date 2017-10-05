package Models;

public class WarTwoPlayer extends War {
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
		// boolean stillPlaying = true;
		int testIterations = 0;
		while (playerOne.stillHasCards() && playerTwo.stillHasCards()) {
			playerOneCard = playerOne.getNextCard();
			playerTwoCard = playerTwo.getNextCard();
			if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 1) {
				System.out.printf("%s wins with %s over %s ", playerOne.getName(), playerOneCard, playerTwoCard);
				playerOne.addCardsToDeck(playerOneCard, playerTwoCard);
				System.out.printf("One - %d, Two - %d\n", playerOne.getDeck().getDeck().size(), playerTwo.getDeck().getDeck().size());
			} else if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 2) {
				System.out.printf("%s wins with %s over %s ", playerTwo.getName(), playerTwoCard, playerOneCard);
				playerTwo.addCardsToDeck(playerOneCard, playerTwoCard);
				System.out.printf("One - %d, Two - %d\n", playerOne.getDeck().getDeck().size(), playerTwo.getDeck().getDeck().size());
			} else {
				war();
			}
			// stillPlaying = false;
			testIterations += 1;
		}
	}

	public void setPlayerDecks() {
		playerOne.setDeck(deck.split());
		playerTwo.setDeck(deck);
	}

	public void war() {
		
		System.out.println("WAR!");
		discardPile.addOntoPile(playerOneCard);
		discardPile.addOntoPile(playerTwoCard);
		discardPile.addOntoPile(playerOne.getNextCard());
		discardPile.addOntoPile(playerTwo.getNextCard());
		playerOneCard = playerOne.getNextCard();
		playerTwoCard = playerTwo.getNextCard();
		//repeat code
		if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 1) {
			System.out.printf("%s wins with %s over %s\n", playerOne.getName(), playerOneCard, playerTwoCard);
			playerOne.addCardsToDeck(discardPile.getPile());
			playerOne.addCardsToDeck(playerOneCard, playerTwoCard);
		} else if (CompareCards.CompareTwoCards(playerOneCard, playerTwoCard) == 2) {
			System.out.printf("%s wins with %s over %s\n", playerTwo.getName(), playerTwoCard, playerOneCard);
			playerTwo.addCardsToDeck(discardPile.getPile());
			playerTwo.addCardsToDeck(playerOneCard, playerTwoCard);
		} else {
			war();
		}
		discardPile.clearPile();
	}

}
