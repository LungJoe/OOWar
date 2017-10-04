package Controllers;

import View.Logger;

public class Driver {
	public static GameController gameController;
	public static Logger logger = new Logger();
	
	public static void main(String args[]){
		switch(logger.pickGameType()){
		case 1:
			gameController = new Game1Controller();
			((Game1Controller) gameController).inputPlayerNames();
			break;
		case 2:
			gameController = new Game2Controller();
			((Game2Controller) gameController).inputPlayerNames();
			break;
		case 3:
			gameController = new Game3Controller();
			((Game3Controller) gameController).inputPlayerNames();
			break;
		}
	}
}
