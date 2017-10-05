package Models;

public class CompareCards {

	Card cardA, cardB;

	public static int CompareTwoCards(Card cardA, Card cardB) {

		if (cardA.getRank() > cardB.getRank()) {
			return 1;
		} else if (cardA.getRank() < cardB.getRank()) {
			return 2;
		} else
			return 0;
	}


}
