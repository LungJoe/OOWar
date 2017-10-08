package Driver;

import java.util.ArrayList;
import java.util.Arrays;

import Models.Card;
import Models.Deck;
import Models.Players;
import Models.WarVarient3;

public class Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
    	ArrayList<Card> deckOfCards = new ArrayList<Card>();
    	deckOfCards = deck.getShuffledDeck();
    	
    	ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
    			new Card("Hearts", 1),
    			new Card("Hearts", 2),
    			new Card("Hearts", 3),
    			new Card("Hearts", 4),
    			new Card("Hearts", 5),
    			new Card("Hearts", 6),
    			new Card("Hearts", 7),
    			new Card("Hearts", 8),
    			new Card("Hearts", 9),
    			new Card("Hearts", 10),
    			new Card("Hearts", 11),
    			new Card("Hearts", 12)));
    	
    	Players seymour = new Players("Seymour");
    	Players sandy = new Players("Sandy");
    	Players bob = new Players("Bob");

    	//WarVarient1 game = new WarVarient1(seymour, sandy, deckOfCards);
		//WarVarient2 game = new WarVarient2(seymour, sandy, deckOfCards);
		WarVarient3 game = new WarVarient3(seymour, sandy, bob, fixeddeck);
    	
		game.playGame();

	}

}
