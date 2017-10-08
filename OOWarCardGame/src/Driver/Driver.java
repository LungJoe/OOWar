package Driver;

import java.util.ArrayList;

import Models.*;

public class Driver {
	public static void main(String[] args) {
		Deck deck = new Deck();
    	//ArrayList<Card> deckOfCards = new ArrayList<Card>();
    	//deckOfCards = deck.getDeck();
    	
    	Players seymour = new Players("Seymour");
    	Players sandy = new Players("Sandy");
    	//Players bob = new Players("Bob");
    	deck.giveDecksToPlayers(seymour, sandy);
    	
    	
    	//WarVarient1 game = new WarVarient1(seymour, sandy);
		WarVarient2 game = new WarVarient2(seymour, sandy);
//    	game.setNumberOfRounds(1);
    	//WarThreePlayers game = new WarThreePlayers(seymour, sandy, bob, deckOfCards);
    	//game.dealCardsToPlayers();
    	game.playGame();
	}
}
