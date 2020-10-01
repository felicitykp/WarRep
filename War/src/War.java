


public class War{

	//VARIABLES
	public Deck p1Deck = new Deck(false);
	public Deck p2Deck = new Deck(false);
	public Deck pile = new Deck(false);

	//CONSTRUCTOR
	public War() {
		Deck deck = new Deck(true);
		
		deck.ShuffleDeck();
		
		for(int i = 0; i < 26; i++) {
			int temp = i;
			Card target = (Card) deck.remove(temp);
			p1Deck.add(target);
		}
		
		p2Deck = deck;
		
		playGame();
		
	}
	
	//METHODS
	
	//adds pile to a player
	public void collect(Deck deck) { 
		pile.add(deck.get(0));
		pile.add(deck.get(0));
	}
	
	//moves first card from player to pile
	public Card place(Deck deck) { 
		Card target = deck.remove(0);
		pile.add(target);
		return target;
	}
	
	//checks if game is over
	public Boolean gameOver() { 
		if(p2Deck.size() == 1 || p1Deck.size() == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public int checkWinner() {
		if(p1Deck.size() == 52) {
			return 1;
		} else {
			return 2;
		}
	}
	
	//prints what card is placed
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
	
	public void playGame() {				
		while (gameOver() == false) {
			
			
			//deal player 1's card
			Card p1 = place(p1Deck);
			print(p1, 1);
			
			//deal player 2's card
			Card p2 = place(p2Deck);
			print(p2, 2);
			
			//check who has higher value
			if (p1.getCardValue() > p2.getCardValue()) {
				collect(p1Deck);
				System.out.println("Player 1 wins battle\n");
			} else if (p1.getCardValue() < p2.getCardValue()) {
				collect(p2Deck);
				System.out.println("Player 2 wins battle\n");
			} else {
				System.out.println("Stalemate! Retry round\n");
			}
		}
		
		System.out.println("Player " + checkWinner() + " wins!");
		
	}
	
	
	

	//NICE CLEAN MAIN METHOD :)
	public static void main(String[] args){
	
	new War();
	
	}
}
