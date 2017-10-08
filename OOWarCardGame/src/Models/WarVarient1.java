package Models;

import java.util.ArrayList;

public class WarVarient1 extends War{
	
	Players player1, player2;
	ArrayList<Card> player1Deck, player2Deck;
	Card player1Upcard, player2Upcard;
	static int maxNumberOfRounds = 10000;

    public WarVarient1(Players player1, Players player2, ArrayList<Card> deck) {
    	super(deck);
    	this.player1 = player1;
    	this.player2 = player2;
    	
    	player1Deck = new ArrayList<Card>();
    	player2Deck = new ArrayList<Card>();
    }
    /*
    public void setNumberOfRounds(int numberOfRounds){
    	this.numberOfRounds = numberOfRounds;
    }
    */
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
    
    private Players determineRoundWinner(){
    	log.initialDraw(player1Upcard, player2Upcard);
    	compareValue = comparer.CompareTwoCards(player1Upcard, player2Upcard);
    	
    	if(compareValue == 1){
    		log.roundWinner(player1);
			return player1;
		}
		else if(compareValue == 2){
			log.roundWinner(player2);
			return player2;
		}
		else if(compareValue == 0){
			return war();
		}
		else
			return null;
    }

    private void setUpRound() {    	
    	player1Upcard = player1.drawCard();
		player2Upcard = player2.drawCard();
		downPile.add(player1Upcard);
		downPile.add(player2Upcard);
	}
        
    private void setUpWar() {
    	downPile.add(player1.drawCard());
    	downPile.add(player2.drawCard());
	}
    
    private Players war(){
    	Players warWinner;
    	log.war();
    	try{
    		setUpWar();
    		setUpRound();
    		warWinner = determineRoundWinner();
    	}catch(NullPointerException e){return null;}
    	
    	return warWinner;
    }
    
    public void awardWinner(){
    	winner.giveCards(downPile);
		winner.setScore(winner.getScore() + downPile.size());
    }
    
    private void determineGameWinner(){
    	if(player1.getScore() > player2.getScore())
    		log.gameWinner(player1);
    	else if(player1.getScore() < player2.getScore())
    		log.gameWinner(player2);
    	else
    		log.draw();
    }
    
    public void playGame(){
    	log.setPlayers(player1, player2);
		int counter = 0;
    	
    	while(player1.hasCards() && player2.hasCards()){
    		
    		setUpRound();
    		
    		if(counter > maxNumberOfRounds){
    			log.numberOfRoundsReached();
    			break;
    		}
    		counter++;
    		
    		winner = determineRoundWinner();
    		if(winner == null)
    			break;
    		
    		awardWinner();
    		log.currentScore(player1.getScore(), player2.getScore());
    		downPile.clear();
    		
    		System.out.println("player1: " + player1.getDeckSize() + "\tplayer2: " + player2.getDeckSize());
    		//System.out.println("Round: " + counter);
    		
    	}
    	determineGameWinner();
    }
}
