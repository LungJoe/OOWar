package Driver;

import java.util.ArrayList;

import Models.*;

public class TestDriver {
	public static void main (String [] args){
		Deck deck = new Deck();
    	ArrayList<Card> deckOfCards = new ArrayList<Card>();
    	deckOfCards = deck.getShuffledDeck();

    	Players seymour = new Players("Seymour");
    	Players sandy = new Players("Sandy");
    	
    	WarVarient1 game = new WarVarient1(seymour, sandy, deckOfCards);
    	game.setNumberOfRounds(30);
    	game.dealCardsToPlayers();
    	game.playGame();

	}
}
