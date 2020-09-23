import java.util.LinkedList;

public class Deck {
	
	//VARIABLES
	public LinkedList<Card> deck; //main linked list to work with

	
	
	//setup deck
	public Deck() {
		
		deck = new LinkedList<Card>();
		
		//HEARTS
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 1);
			deck.add(temp);
		}
		
		//CLUBS
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 2);
			deck.add(temp);
		}
		
		//DIAMONDS
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 3);
			deck.add(temp);
		}
		
		//SPADES
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 4);
			deck.add(temp);
		}
		
	}
	
	//setup shuffle method
	public void ShuffleDeck() {
		for(int i = 0; i < 52; i++) {
			int temp = (int)(Math.random() * (52 - i));
			Card target = deck.remove(temp);
			deck.add(target);
		}
	}
	
	
	

}
