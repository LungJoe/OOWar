package Models;

import java.util.ArrayList;

public class CompareCards {
	
	Card cardA, cardB;
	
	
	public int CompareTwoCards(Card cardA, Card cardB){
		this.cardA = cardA;
		this.cardB = cardB;
		
		if(cardA.getRank() > cardB.getRank()){
			return 1;
		}
		else if(cardA.getRank() < cardB.getRank()){
			return 2;
		}
		else
			return 0;
	}
	
	
	
	public static int CompareTwoCards(Pile pile){
		int highestRank = 0;
		int index = -1;
		for(Card card : pile.getPile()) {
		    if(card.getRank() == highestRank) {
			return -2;
		    }
		    else if( card.getRank() > highestRank) {
			highestRank = card.getRank();
			index += 1;
		    }
		}
		
		return index;
	}
	
	//private String CompareThreeCards(){
	//	for(int i = 0; i < 3; i++){
			//if(cardsToBeCompared.get(i).getRank() )
		//}
		
	//}
	


}
