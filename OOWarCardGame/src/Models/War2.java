package Models;

import java.util.ArrayList;

public class War2 {
	CompareCards comparer;
	Logger log;
	ArrayList<Card> gameDeck, downPile;
	int compareValue;
	
	public War2(ArrayList<Card> deck){
    	gameDeck = deck;
    	downPile = new ArrayList<Card>();
    	comparer = new CompareCards();
    	log = new Logger();
	}
}
