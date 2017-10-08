package Models;

public interface WarInterface {
	
	public void splitDeck();

    public void dealCardsToPlayers();

    public void setUpRound();
        
    public void setUpWar();
    
    public Players war();
    
    public Players determineRoundWinner();

    public void determineGameWinner();
    
    public void awardWinner();

    public void playGame();

}
