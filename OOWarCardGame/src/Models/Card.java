package Models;

public class Card {

	private String suit;
	private String name;
	private int value;
	
		public Card(String suit, String name){
			this.setSuit(suit);
			this.setName(name);
			this.setValue(name);
		}

		public String getSuit() {
			return suit;
		}

		public void setSuit(String suit) {
			this.suit = suit;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getValue() {
			return value;
		}

		public void setValue(String name) {
			switch(name){
			case "2": this.value = 2; break;
			case "3": this.value = 3; break;
			case "4": this.value = 4; break;
			case "5": this.value = 5; break;
			case "6": this.value = 6; break;
			case "7": this.value = 7; break;
			case "8": this.value = 8; break;
			case "9": this.value = 9; break;
			case "10": this.value = 10; break;
			case "Jack": this.value = 11; break;
			case "Queen": this.value = 12; break;
			case "King": this.value = 13; break;
			case "Ace": this.value = 14; break;
			}
		}
		public String toString(){
			return getName() + " of " + getSuit();
		}
}