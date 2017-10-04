package Models;

import java.util.ArrayList;

public class WarVarient1 {
	
	Players player1, player2;
	CompareCards comparer;
	ArrayList<Card> gameDeck, downPile, player1Deck, player2Deck;

    public WarVarient1(Players player1, Players player2, ArrayList<Card> deck) {
    	this.player1 = player1;
    	this.player2 = player2;
    	gameDeck = deck;
    	
    	downPile = new ArrayList<Card>();
    	player1Deck = new ArrayList<Card>();
    	player2Deck = new ArrayList<Card>();
    	
    	comparer = new CompareCards();
    }
    
    private void splitDeck(){
    	int deckSize = gameDeck.size();
    	int playerDeckSize= deckSize/2;;
    	
    	for(int i = 0; i < playerDeckSize; i++){
    		player1Deck.add(gameDeck.get(i));
    		player2Deck.add(gameDeck.get((deckSize -1)-i));
    	}
    }

    public void dealCardsToPlayers(){
    	splitDeck();
    	player1.giveCards(player1Deck);
    	player2.giveCards(player2Deck);
    }
    
    public void playGame(){
    	Card cardA, cardB;
		
    	for(int i = 0; i < 20; i++){
    		cardA = player1.drawCard();
    		cardB = player2.drawCard();
    		
    		System.out.println(player1.getName() + " plays \t" + cardA.toString() + " as up card.");
    		System.out.println(player2.getName() + " plays \t" + cardB.toString() + " as up card.");
    		
    		int compareValue = comparer.CompareTwoCards(cardA, cardB);
    		
    		if(compareValue == 1){
    			System.out.println(player1.getName() + " wins the round!");
    			player1.setScore(player1.getScore() + 1);
    		}
    		else if(compareValue == 2){
    			System.out.println(player2.getName() + " wins the round!");
    			player2.setScore(player2.getScore() + 1);
    		}
    		else if(compareValue == 0)
    			System.out.println("Its a tie! Now we go to war...\n");
    		
    		if(compareValue != 0)
    			System.out.printf("SCORE is %s %d, %s %d\n\n", 
    				player1.getName(), player1.getScore(), 
    				player2.getName(), player2.getScore());
    	}
    }
}
