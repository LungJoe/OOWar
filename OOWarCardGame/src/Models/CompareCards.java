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
	
	
	//private String CompareThreeCards(){
	//	for(int i = 0; i < 3; i++){
			//if(cardsToBeCompared.get(i).getRank() )
		//}
		
	//}
	


}
