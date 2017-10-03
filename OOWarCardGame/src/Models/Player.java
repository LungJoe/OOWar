package Models;

import java.util.ArrayList;

public class Player {
    String name;
    Deck deck;

    public Player(String name, Deck deck) {
	this.name = name;
	this.deck = deck;
    }

    public Player(String name) {
	this.name = name;
	this.deck = new Deck();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Deck getDeck() {
	return deck;
    }

    public void setDeck(Deck deck) {
	this.deck = deck;
    }

}
