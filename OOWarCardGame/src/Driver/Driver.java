package Driver;

import java.util.ArrayList;

import Models.*;

public class Driver {
	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffleDeck();
		/*
		Deck winningDeck = new Deck();
		Card card = new Card("Clubs", 4);
		Card card1 = new Card("Clubs", 12);
		Card card2 = new Card("Clubs", 11);
		winningDeck.clearDeck();
		winningDeck.addCard(card);
		winningDeck.addCard(card1);
		winningDeck.addCard(card2);
		
		
		
		Deck losingDeck = new Deck();
		Card card3 = new Card("Hearts", 4);
		Card card4 = new Card("Hearts", 2);
		Card card5 = new Card("Hearts", 3);
		losingDeck.clearDeck();
		losingDeck.addCard(card3);
		losingDeck.addCard(card4);
		losingDeck.addCard(card5);
		*/
		
		Player Jack = new Player("Jack");
		Player Jessica = new Player("Jessica");

		
		WarTwoPlayer game = new WarTwoPlayer(Jack, Jessica, deck);
		
		game.setPlayerDecks();
		
		
		Jack.showDeck();
		System.out.println();
		Jessica.showDeck();
		System.out.println();
		
		
		game.playGame();
	}
}
