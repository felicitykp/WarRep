public class Deck extends LinkedList<Card>{
	
	
	//setup deck
	public Deck() {
		
		//HEARTS
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 1);
			add(temp);
		}
		
		//CLUBS
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 2);
			add(temp);
		}
		
		//DIAMONDS
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 3);
			add(temp);
		}
		
		//SPADES
		for(int i = 1; i <= 13; i++) {
			Card temp = new Card(i, 4);
			add(temp);
		}
		
	}
	
	//SHUFFLE METHOD
	public void ShuffleDeck() {
		
		for(int i = 0; i < 52; i++) {
			int temp = (int)(Math.random() * (52 - i));
			Card target = remove(temp);
			add(target);
			
		}
		
	}
	
	

}
