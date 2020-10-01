
public class Card {

	//1 IS HEARTS
	//2 IS CLUBS
	//3 IS DIAMONDS
	//4 IS SPADES
	
	private int value;
	private int suit;
	
	final static String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; // mr. david change
	
	public Card(int v, int s) {
		value = v;
		suit = s;
	}
	
	public int getCardValue() {
		return value;
	}
	
	public int getCardSuit() {
		return suit;
	}
	
	//simpler toString method for printing
	public String toString() {
		return value + " of " + suits[suit-1];		
	}
	
}
