package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Deck{
    ArrayList<Card> cards;
    Random rand = new Random();
    int randomNumber;
    
    
    public Deck() {
	cards = new ArrayList<Card>();
	while(cards.size() < 52) {
	    randomNumber = rand.nextInt(52);
	    Card generateCard = new Card(randomNumber);
	    if(cards.indexOf(generateCard) == -1) {
		cards.add(generateCard);
	    }
	}
    }
    
    public void shuffleDeck() {
	Collections.shuffle(cards);
    }
    
    public Card getNextCard() {
	Card topCard = cards.get(0);
	cards.remove(0);
	return topCard;
	
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    
    
}
