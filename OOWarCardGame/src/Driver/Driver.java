package Driver;

import java.util.ArrayList;

import Models.*;

public class Driver {
    public static void main(String[] args) {
    	
    	Deck deck = new Deck();
    	ArrayList<Card> deckOfCards = new ArrayList<Card>();
    	
    	deckOfCards = deck.getOrderedDeck();
    	System.out.println(		"\n---------------------------------------\n"
    						+	"Print out the ordered deck of cards.\n"
    						+	"---------------------------------------");
    	for(Card card: deckOfCards){
    		System.out.println(card);
    	}
    	
    	deckOfCards = deck.getShuffledDeck();
    	System.out.println(		"\n---------------------------------------\n"
							+	"Print out the shuffled deck of cards.\n"
							+	"---------------------------------------");
    	for(Card card: deckOfCards){
    		System.out.println(card);
    	}
    	
    	
    	Player Jack = new Player("Jack");
    	Player Jessica = new Player("Jessica");
	
    	WarGame war = new WarGame(Jack, Jessica);
    	Jack.showDeck();
	
    	//war.plauGame();
    }
}
