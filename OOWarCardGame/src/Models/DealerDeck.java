package Models;

import Models.Deck;

public class DealerDeck extends Deck{

	public DealerDeck() {
		this.initializeDealerDeck();
		this.shuffleDeck();
	}

	public void initializeDealerDeck(){
		this.cards.add(new Card("Hearts", "2"));
		this.cards.add(new Card("Hearts", "3"));
		this.cards.add(new Card("Hearts", "4"));
		this.cards.add(new Card("Hearts", "5"));
		this.cards.add(new Card("Hearts", "6"));
		this.cards.add(new Card("Hearts", "7"));
		this.cards.add(new Card("Hearts", "8"));
		this.cards.add(new Card("Hearts", "9"));
		this.cards.add(new Card("Hearts", "10"));
		this.cards.add(new Card("Hearts", "Jack"));
		this.cards.add(new Card("Hearts", "Queen"));
		this.cards.add(new Card("Hearts", "King"));
		this.cards.add(new Card("Hearts", "Ace"));
		
		this.cards.add(new Card("Spades", "2"));
		this.cards.add(new Card("Spades", "3"));
		this.cards.add(new Card("Spades", "4"));
		this.cards.add(new Card("Spades", "5"));
		this.cards.add(new Card("Spades", "6"));
		this.cards.add(new Card("Spades", "7"));
		this.cards.add(new Card("Spades", "8"));
		this.cards.add(new Card("Spades", "9"));
		this.cards.add(new Card("Spades", "10"));
		this.cards.add(new Card("Spades", "Jack"));
		this.cards.add(new Card("Spades", "Queen"));
		this.cards.add(new Card("Spades", "King"));
		this.cards.add(new Card("Spades", "Ace"));
		
		this.cards.add(new Card("Diamonds", "2"));
		this.cards.add(new Card("Diamonds", "3"));
		this.cards.add(new Card("Diamonds", "4"));
		this.cards.add(new Card("Diamonds", "5"));
		this.cards.add(new Card("Diamonds", "6"));
		this.cards.add(new Card("Diamonds", "7"));
		this.cards.add(new Card("Diamonds", "8"));
		this.cards.add(new Card("Diamonds", "9"));
		this.cards.add(new Card("Diamonds", "10"));
		this.cards.add(new Card("Diamonds", "Jack"));
		this.cards.add(new Card("Diamonds", "Queen"));
		this.cards.add(new Card("Diamonds", "King"));
		this.cards.add(new Card("Diamonds", "Ace"));
		
		this.cards.add(new Card("Clubs", "2"));
		this.cards.add(new Card("Clubs", "3"));
		this.cards.add(new Card("Clubs", "4"));
		this.cards.add(new Card("Clubs", "5"));
		this.cards.add(new Card("Clubs", "6"));
		this.cards.add(new Card("Clubs", "7"));
		this.cards.add(new Card("Clubs", "8"));
		this.cards.add(new Card("Clubs", "9"));
		this.cards.add(new Card("Clubs", "10"));
		this.cards.add(new Card("Clubs", "Jack"));
		this.cards.add(new Card("Clubs", "Queen"));
		this.cards.add(new Card("Clubs", "King"));
		this.cards.add(new Card("Clubs", "Ace"));
	}
}
