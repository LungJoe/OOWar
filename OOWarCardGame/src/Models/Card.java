package Models;

public class Card 
{
	String suit;
	int rank;

	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public String toString() {
		String value = Integer.toString(rank);

		switch (rank) {
		case 11:
			value = "JACK";
			break;
		case 12:
			value = "QUEEN";
			break;
		case 13:
			value = "KING";
			break;
		case 14:
			value = "ACE";
		}
		
		return value + " of " + suit;
	}
}
