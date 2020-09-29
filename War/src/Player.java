
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
	
	public Card place(LinkedList<Card> deck) {
		Card target = deck.remove(1);
		pile.add(target);
		return target;
	}
	
	public Boolean gameOver() {
		if(p1Deck.size() == 52 || p1Deck.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print(Card temp, int x) {
		
		if(temp.getCardSuit() == 1) {
			if(temp.getCardValue() < 11) {
				System.out.println("Player " + x + " has placed a " + temp.getCardValue() + " of Hearts");
			} else if (temp.getCardValue() == 11) {
				System.out.println("Player " + x + " has placed a Jack of Hearts");
			} else if (temp.getCardValue() == 12) {
				System.out.println("Player " + x + " has placed a Queen of Hearts");
			} else if (temp.getCardValue() == 13) {
				System.out.println("Player " + x + " has placed a King of Hearts");
			}
		} else if (temp.getCardSuit() == 2) {
			if(temp.getCardValue() < 11) {
				System.out.println("Player " + x + " has placed a " + temp.getCardValue() + " of Clubs");
			} else if (temp.getCardValue() == 11) {
				System.out.println("Player " + x + " has placed a Jack of Clubs");
			} else if (temp.getCardValue() == 12) {
				System.out.println("Player " + x + " has placed a Queen of Clubs");
			} else if (temp.getCardValue() == 13) {
				System.out.println("Player " + x + " has placed a King of Clubs");
			}
		} else if (temp.getCardSuit() == 3) {
			if(temp.getCardValue() < 11) {
				System.out.println("Player " + x + " has placed a " + temp.getCardValue() + " of Diamonds");
			} else if (temp.getCardValue() == 11) {
				System.out.println("Player " + x + " has placed a Jack of Diamonds");
			} else if (temp.getCardValue() == 12) {
				System.out.println("Player " + x + " has placed a Queen of Diamonds");
			} else if (temp.getCardValue() == 13) {
				System.out.println("Player " + x + " has placed a King of Diamonds");
			}
		} else {
			if(temp.getCardValue() < 11) {
				System.out.println("Player " + x + " has placed a " + temp.getCardValue() + " of Spades");
			} else if (temp.getCardValue() == 11) {
				System.out.println("Player " + x + " has placed a Jack of Spades");
			} else if (temp.getCardValue() == 12) {
				System.out.println("Player " + x + " has placed a Queen of Spades");
			} else if (temp.getCardValue() == 13) {
				System.out.println("Player " + x + " has placed a King of Spades");
			}
		}
		
		
		
		
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
