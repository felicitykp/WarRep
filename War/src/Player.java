
public class Player {

	//VARIABLES
	public LinkedList<Card> p1Deck = new LinkedList<Card>();
	public LinkedList<Card> p2Deck = new LinkedList<Card>();
	public LinkedList<Card> pile = new LinkedList<Card>();
	
	//CONSTRUCTOR
	public Player() {
		Deck deck = new Deck();
		
		deck.ShuffleDeck();
		
		for(int i = 0; i < 26; i++) {
			int temp = i;
			Card target = (Card) deck.remove(temp);
			p1Deck.add(target);
		}
		
		for(int i = 0; i < 26; i++) {
			int temp = i;
			Card target = (Card) deck.remove(temp);
			p2Deck.add(target);
		}
	}
	
	//METHODS
	public void collect(LinkedList<Card> deck) {
		pile.add(deck.get(0));
	}
	
	public void p1Win() {
		//p1Deck.add(pile);
	}
	
	
	
	//ACCESSOR 
	public LinkedList<Card> getp1Deck(){
		return p1Deck;
	}
	
	public LinkedList<Card> getp2Deck(){
		return p2Deck;
	}
	
	public LinkedList<Card> getPile() {
		return pile;
	}
}
