package Models;

public class Logger {
	Players player1, player2;
	
	
	public void setPlayers(Players p1, Players p2){
		player1 = p1;
		player2 = p2;
	}
	
	
	public void initialDraw(Card cardA, Card cardB){
		System.out.println(player1.getName() + " plays \t" + cardA.toString() + " as up card.");
		System.out.println(player2.getName() + " plays \t" + cardB.toString() + " as up card.");
	}
	
	public void roundWinner(Players winner){
		System.out.println(player1.getName() + " wins the round!");
	}
	
	public void currentScore(int player1Score, int player2Score){
		System.out.printf("SCORE is %s %d, %s %d\n\n", 
				player1.getName(), player1Score, 
				player2.getName(), player2Score);
	}
	
	public void war(){
		System.out.println("WAR!");
	}
		
}
