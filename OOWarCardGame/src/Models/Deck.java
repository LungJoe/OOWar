package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{
	String [] suits = {"HEARTS", "SPADES", "CLUBS", "DIAMONDS"};
	ArrayList<Card> cards;
	
	
    public Deck(){
    	cards = new ArrayList<Card>();
    	createOrderedDeck();
    }
    
    private void createOrderedDeck(){
    	for(int i = 0; i < suits.length; i++){
    		for(int j = 1; j <= 13; j++){
    			cards.add(new Card(suits[i], j));
    		}
    	}
    }
    
    public ArrayList<Card> getOrderedDeck(){
    	return cards;
    }
    
    public ArrayList<Card> getShuffledDeck(){
    	Collections.shuffle(cards);
    	return cards;
    }
    
    public void showCards() {
    	for(Card card : cards) {
    		System.out.println(card);
    	}
    }
	
	
	/**
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
    **/
}
