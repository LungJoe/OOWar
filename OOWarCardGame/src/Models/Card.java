package Models;

public class Card // implements Comparable
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
}
