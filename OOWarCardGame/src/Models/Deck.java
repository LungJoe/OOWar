package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{
    ArrayList<Card> cards;
    Random rand = new Random();
    int randomNumber;
    
    public Deck() {
    	cards = new ArrayList<Card>();
		for(int i = 0; i < 52; i++) {
			Card generatedCard = new Card(i);
			cards.add(generatedCard);
		}
		shuffleDeck();
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
    
    public void showCards() {
    	for(Card card : cards) {
    		System.out.println(card.toString());
    	}
    }
}
