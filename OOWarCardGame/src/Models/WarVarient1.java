package Models;

import java.util.ArrayList;

public class WarVarient1 extends War2{
	
	Players player1, player2;
	ArrayList<Card> player1Deck, player2Deck;
	Card player1Upcard, player2Upcard;
	
	
    public WarVarient1(Players player1, Players player2, ArrayList<Card> deck) {
    	super(deck);
    	this.player1 = player1;
    	this.player2 = player2;
    	
    	player1Deck = new ArrayList<Card>();
    	player2Deck = new ArrayList<Card>();
    }
    
    private void splitDeck(){
    	int deckSize = gameDeck.size();
    	int playerDeckSize = deckSize/2;;
    	
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
    
    public Players determineRoundWinner(){
    	Players winner = null;
    	compareValue = comparer.CompareTwoCards(player1Upcard, player2Upcard);
    	
    	if(compareValue == 1){
    		log.roundWinner(player1);
			winner = player1;
		}
    	
		else if(compareValue == 2){
			log.roundWinner(player2);
			winner = player2;
		}
		else if(compareValue == 0){
			log.war();
			war();
		}
		
		return winner;
    }
    
    public void setUpRound() {
    	player1Upcard = player1.drawCard();
		player2Upcard = player2.drawCard();
		downPile.add(player1Upcard);
		downPile.add(player2Upcard);
    	
        }
        
    public void setUpWar() {
    	downPile.add(player1.drawCard());
    	downPile.add(player2.drawCard());
	}
    
    public void war(){
    	setUpWar();
    	determineRoundWinner().giveCards(downPile);;
    	downPile.clear();
    }
    public void playGame(){
    	player1Upcard = player1.drawCard();
		player2Upcard = player2.drawCard();
    	
    	while(player1Upcard != null && player2Upcard != null){
    		log.initialDraw(player1Upcard, player2Upcard);
    		determineRoundWinner().setScore(player1.getScore() + 1);
    		log.currentScore(player1.getScore(), player2.getScore());
    	}
    }
}
