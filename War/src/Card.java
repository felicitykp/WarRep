
public class Card {

	//1 IS HEARTS
	//2 IS CLUBS
	//3 IS DIAMONDS
	//4 IS SPADES
	
	private int value;
	private int suit;
	
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
	
	
	
}
