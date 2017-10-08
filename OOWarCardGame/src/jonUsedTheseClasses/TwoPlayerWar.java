package jonUsedTheseClasses;

import java.util.ArrayList;

public class TwoPlayerWar implements WarInterface{
	
	final int maxNumberOfRounds = 10000;
	int compareValue;
	
	Players player1, player2, winner;
	Card player1Upcard, player2Upcard;
	ArrayList<Card> player1Deck, player2Deck, gameDeck, downPile;
	CompareCards comparer;
	Logger log;

    public TwoPlayerWar(Players player1, Players player2, ArrayList<Card> deck) {
    	
    	this.player1 = player1;
    	this.player2 = player2;
    	gameDeck = deck;
    	player1Deck = new ArrayList<Card>();
    	player2Deck = new ArrayList<Card>();
    	
    	downPile = new ArrayList<Card>();
    	comparer = new CompareCards();
    	log = new Logger();
    }

    public void splitDeck(){
    	int deckSize = gameDeck.size();
    	int playerDeckSize = deckSize/2;
    	
    	if(playerDeckSize%2 != 0)
    		playerDeckSize--;
    	
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
    
    public Players war(){
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
		//winner.setScore(winner.getScore() + downPile.size());
    	winner.addScore(downPile.size());
    }
    
    public void determineGameWinner(){
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
		
		dealCardsToPlayers();
    	
    	while(player1.hasCards() && player2.hasCards()){
    		if(counter > maxNumberOfRounds){
    			log.numberOfRoundsReached();
    			break;
    		}
    		counter++;
    		
    		setUpRound();    		
    		winner = determineRoundWinner();
    		if(winner == null)
    			break;
    		
    		awardWinner();
    		log.currentScore(player1.getScore(), player2.getScore());
    		downPile.clear();
    	}
    	determineGameWinner();
    }
}
