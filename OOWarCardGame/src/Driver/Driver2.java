package Driver;

import java.util.ArrayList;

import Models.Card;
import Models.Deck;
import Models.Players;
import Models.WarVarient2;
import Models.WarVarient3;

public class Driver2 {

	public static void main(String[] args) {
		Deck deck = new Deck();
    	ArrayList<Card> deckOfCards = new ArrayList<Card>();
    	deckOfCards = deck.getShuffledDeck();
    	
    	Players seymour = new Players("Seymour");
    	Players sandy = new Players("Sandy");
    	Players bob = new Players("Bob");

    	//WarVarient1 game = new WarVarient1(seymour, sandy);
		//WarVarient2 game = new WarVarient2(seymour, sandy, deckOfCards);
		WarVarient3 game = new WarVarient3(seymour, sandy, bob, deckOfCards);
//    	game.setNumberOfRounds(1);
    	//WarThreePlayers game = new WarThreePlayers(seymour, sandy, bob, deckOfCards);
    	//game.dealCardsToPlayers();
    	game.playGame();

	}

}
