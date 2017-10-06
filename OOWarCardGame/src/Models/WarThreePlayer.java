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
				displayWinner(playerOne, playerTwo,playerThree);
			} else if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 2) {
				displayWinner(playerTwo, playerOne,playerThree);
			} else if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 3) {
				displayWinner(playerThree, playerOne,playerTwo);
			} else if (CompareCards.CompareThreeCards(playerOneCard, playerTwoCard, playerThreeCard) == 4){
				war();
			}
			// stillPlaying = false;
			testIterations += 1;
		}
	}
	
	public void displayWinner(Player winner, Player firstLoser, Player secondLoser){
		System.out.printf("%s wins with %s over %s ", winner.getName(), winner, firstLoser, secondLoser);
		playerOne.addCardsToDeck(playerOneCard, playerTwoCard, playerThreeCard);
		if (!discardPile.isEmpty()){
			playerOne.addCardsToDeck(discardPile.getPile());
		}
		System.out.printf("One - %d, Two - %d\n, Three - %d\n", winner.getDeck().getDeck().size(), firstLoser.getDeck().getDeck().size(),
				secondLoser.getDeck().getDeck().size());
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


