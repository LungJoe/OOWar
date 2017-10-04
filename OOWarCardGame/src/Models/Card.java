package Models;

public class Card //implements Comparable
{
	String suit;
	int rank;
	
	public Card(String suit, int rank){
		this.suit = suit;
		this.rank= rank;
	}
	
	public String getSuit(){
		return suit;
	}
	
	public int getRank(){
		return rank;
	}
	
	public String toString() {
		String value = Integer.toString(rank);
		
		switch (rank){
			case 1:
				value = "ACE";
				break;
			case 11:
				value = "JACK";
				break;
			case 12:
				value = "QUEEN";
				break;
			case 13:
				value = "KING";
		}
    	return value + " of " + suit;
    }
    
	/**
	String[] suits = {"Heart", "Spade", "Club", "Diamond"};
    String[] faceCards = {"Jack","Queen","King","Ace"};
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
		if (numValue > 8) {
			this.value = faceCards[numValue % 9];
		} else {
			this.value = Integer.toString(numValue + 2) ;
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

    public int compareTo(Object o) {
    	Card compareCard = (Card) o;
    	//if()
    	return 0;
    }
    **/
}
