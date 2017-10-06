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


	public static int CompareThreeCards(Card cardA, Card cardB, Card cardC){
		if ( (cardA.getRank() > cardB.getRank()) && (cardA.getRank() > cardC.getRank()) ){
			return 1;
		} else if ( (cardB.getRank() > cardA.getRank()) && (cardB.getRank() > cardC.getRank()) ){
			return 2;
		} else if ( (cardC.getRank() > cardA.getRank()) && (cardC.getRank() > cardB.getRank()) ){
			return 3;
		} else if ( ((cardA.getRank() ==  cardB.getRank()) && (cardA.getRank() == cardC.getRank())) ||
					((cardB.getRank() ==  cardA.getRank()) && (cardB.getRank() == cardC.getRank()))	||
					((cardC.getRank() ==  cardA.getRank()) && (cardC.getRank() == cardB.getRank()))){
			return 4;
		} else {
			return 0;
		}
		
		
	}
}
