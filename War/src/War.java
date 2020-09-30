
public class War {

	//VARIABLES
	public static LinkedList<Card> p1Deck = new LinkedList<Card>();
	public static LinkedList<Card> p2Deck = new LinkedList<Card>();
	public static LinkedList<Card> pile = new LinkedList<Card>();
	
	//CONSTRUCTOR
	public War() {
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
	public void collect(LinkedList<Card> deck) { //adds cards from pile to the player
		pile.add(deck.get(0));
	}
	
	public Card place(LinkedList<Card> deck) { //places first card from player to pile
		Card target = deck.remove(0);
		pile.add(target);
		return target;
	}
	
	public Boolean gameOver() { //check if game is over
		if(p1Deck.size() == 52 || p1Deck.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print(Card temp, int x) { //prints what card is placed
		
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


public static void main(String[] args){
	War play = new War();
	
	while (play.gameOver() == false) {
		
		//deal player 1's card
		Card p1 = play.place(p1Deck);
		play.print(p1, 1);
		
		//deal player 2's card
		Card p2 = play.place(p2Deck);
		play.print(p2, 2);
		
		//check who has higher value
		if (p1.getCardValue() > p2.getCardValue()) {
			play.collect(p1Deck);
			System.out.println("Player 1 wins battle");
		} else if (p1.getCardValue() < p2.getCardValue()) {
			play.collect(p2Deck);
			System.out.println("Player 2 wins battle");
		} else {
			System.out.println("Stalemate! Retry round");
		}
		
	}
	
}
}
