package Models;

public class Card implements Comparable{
    String[] suits = {"Heart", "Spade", "Club", "Diamond"};
    String[] faceCards = {"Ace","King","Queen","Jack"};
    String suit;
    String value;

    public Card(String suit, String value) {
	this.suit = suit;
	this.value = value;
    }

    public Card(int number) {
	int suitIndex = (int) number / 13;
	this.suit = suits[suitIndex];
	int numValue = number % 13;
	if(numValue > 10) {
	    this.value = faceCards[numValue % 10];
	} else {
	    this.value = Integer.toString(numValue);
	}
    }

    public String getSuit() {
	return suit;
    }

    public void setSuit(String suit) {
	this.suit = suit;
    }

    public String getValue() {
	return value;
    }

    public void setValue(String value) {
	this.value = value;
    }

    public int compareTo(Card otherCard) {

	return 0;
    }
    
    @Override
    public String toString() {
	return value + " of " + suit + "s";
    }

    @Override
    public int compareTo(Object o) {
	Card compareCard = (Card) o;
	//if()
	return 0;
    }

}
