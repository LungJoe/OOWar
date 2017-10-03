package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> cards;
    Random rand;
    
    
    public Deck() {
	
    }
    
    public void shuffleDeck() {
	Collections.shuffle(cards);
    }
    
    public Card getNextCard() {
	Card topCard = cards.get(0);
	cards.remove(0);
	return topCard;
	
    }
    
    
}
