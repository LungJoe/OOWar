package Models;

import java.util.ArrayList;

public class WarThreePlayer extends War{
	ArrayList<Card> deck;
	Players playerOne;
	Players playerTwo;
	Players playerThree;
	Card playerOneCard;
	Card playerTwoCard;
	Card playerThreeCard;
	ArrayList<Card> player1Deck, player2Deck, player3Deck;
	
 WarThreePlayer(Players playerOne, Players playerTwo, Players playerThree, ArrayList<Card> deck) {
		super(deck);
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		this.playerThree = playerThree;
		//discardPile = 
		this.deck = deck;
	}

	public void playGame() {
		// boolean stillPlaying = true;
		int testIterations = 0;
		while (playerOne.hasCards() && playerTwo.hasCards()) {
			playerOneCard = playerOne.drawCard();
			playerTwoCard = playerTwo.drawCard();
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
	
//	public void displayWinner(Player winner, Player firstLoser, Player secondLoser){
//		System.out.printf("%s wins with %s over %s ", winner.getName(), winner, firstLoser, secondLoser);
//		playerOne.addCardsToDeck(playerOneCard, playerTwoCard, playerThreeCard);
//		if (!discardPile.isEmpty()){
//			playerOne.addCardsToDeck(discardPile.getPile());
//		}
//		System.out.printf("One - %d, Two - %d\n, Three - %d\n", winner.getDeck().getDeck().size(), firstLoser.getDeck().getDeck().size(),
//				secondLoser.getDeck().getDeck().size());
//	}
	

    private void splitDeck(){
    	int deckSize = gameDeck.size();
    	int playerDeckSize = deckSize/2;;
    	
    	for(int i = 0; i < playerDeckSize; i++){
    		player1Deck.add(gameDeck.get(i));
    		player2Deck.add(gameDeck.get((deckSize -1)-i));
    	}
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


