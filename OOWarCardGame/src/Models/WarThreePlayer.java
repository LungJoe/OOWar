package Models;

public class WarThreePlayer extends War{
	Pile discardPile;
	Deck deck;
	Player playerOne;
	Player playerTwo;
	Player playerThree;
	Card playerOneCard;
	Card playerTwoCard;
	Card playerThreeCard;

	public WarThreePlayer(Player playerOne, Player playerTwo, Player playerThree, Deck deck) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		this.playerThree = playerThree;
		discardPile = new Pile();
		this.deck = deck;
	}

	public void playGame() {
		// boolean stillPlaying = true;
		int testIterations = 0;
		while (playerOne.stillHasCards() && playerTwo.stillHasCards()) {
			playerOneCard = playerOne.getNextCard();
			playerTwoCard = playerTwo.getNextCard();
			playerThreeCard = playerThree.getNextCard();
			if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 1) {
				System.out.printf("%s wins with %s over %s ", playerOne.getName(), playerOneCard, playerTwoCard, playerThreeCard);
				playerOne.addCardsToDeck(playerOneCard, playerTwoCard, playerThreeCard);
				playerOne.addCardsToDeck(discardPile.getPile());
				System.out.printf("One - %d, Two - %d\n, Three - %d\n", playerOne.getDeck().getDeck().size(), playerTwo.getDeck().getDeck().size(),
						playerThree.getDeck().getDeck().size());
			} else if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 2) {
				System.out.printf("%s wins with %s over %s ", playerTwo.getName(), playerOneCard, playerTwoCard, playerThreeCard);
				playerOne.addCardsToDeck(playerOneCard, playerTwoCard, playerThreeCard);
				playerOne.addCardsToDeck(discardPile.getPile());
				System.out.printf("One - %d, Two - %d\n, Three - %d\n", playerTwo.getDeck().getDeck().size(), playerOne.getDeck().getDeck().size(),
						playerThree.getDeck().getDeck().size());
			} else if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 3) {
				System.out.printf("%s wins with %s over %s ", playerThree.getName(), playerOneCard, playerTwoCard, playerThreeCard);
				playerOne.addCardsToDeck(playerOneCard, playerTwoCard, playerThreeCard);
				playerOne.addCardsToDeck(discardPile.getPile());
				System.out.printf("One - %d, Two - %d\n, Three - %d\n", playerThree.getDeck().getDeck().size(), playerOne.getDeck().getDeck().size(),
						playerThree.getDeck().getDeck().size());
			}else if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 4){
				war();
			}
			// stillPlaying = false;
			testIterations += 1;
		}
	}

	public void setPlayerDecks() {
		playerOne.setDeck(deck.split());
		playerTwo.setDeck(deck.split());
		playerThree.setDeck(deck);
	}

	public void war() {
		System.out.println("WAR!");
		discardPile.addOntoPile(playerOneCard);
		discardPile.addOntoPile(playerTwoCard);
		discardPile.addOntoPile(playerThreeCard);
		
		discardPile.addOntoPile(playerOne.getNextCard());
		discardPile.addOntoPile(playerTwo.getNextCard());
		discardPile.addOntoPile(playerThree.getNextCard());
		
		playerOneCard = playerOne.getNextCard();
		playerTwoCard = playerTwo.getNextCard();
		playerThreeCard = playerThree.getNextCard();
		
		playGame();
		
		discardPile.clearPile();
	}

}


