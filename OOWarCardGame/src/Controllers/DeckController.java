package Controllers;

import Models.*;

public class DeckController {
	
	public DealerDeck dealerDeck;
	public Deck player1Deck;
	public Deck player2Deck;
	
	public DeckController(){
		dealerDeck = new DealerDeck();
		player1Deck = new Deck();
		player2Deck = new Deck();
		
		//dealerDeck.printDeck();
		this.dealDeck();
		System.out.println("DECK 1");
		player1Deck.printDeck();
		System.out.println("\n\nDECK 2");
		player2Deck.printDeck();
	}
	
	public void dealDeck(){
		boolean dealPlayer1 = true;
		while(!dealerDeck.cards.isEmpty()){
			if(dealPlayer1){
				player1Deck.cards.add(dealerDeck.cards.remove(0));
				dealPlayer1 = false;
			}
			if(!dealPlayer1){
				player2Deck.cards.add(dealerDeck.cards.remove(0));
				dealPlayer1 = true;
			}
		}
	}
}
