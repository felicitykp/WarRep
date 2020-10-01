


public class War{

	//VARIABLES
	public Deck p1Deck = new Deck(false);
	public Deck p2Deck = new Deck(false);
	public Deck pile = new Deck(false);
	
	public int battles = 1;

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
		deck.add(pile.get(0));
		deck.add(pile.get(0));
	}
	
	//moves first card from player to pile
	public Card place(Deck deck) { 
		Card target = deck.remove(0);
		pile.addTo(target, 0);
		return target;
	}
	
	//checks if game is over
	public Boolean gameOver() { 
		if(p2Deck.size() == 0 || p1Deck.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int checkWinner() {
		if(p1Deck.size() == 0) {
			return 2;
		} else if (p2Deck.size() == 0){
			return 1;
		}
		return 0;
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
	
	public void printDeckSize(Deck deck, int player) {
		int size = deck.size();
		System.out.println("Player " + player + " has " + size + " cards");
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
				System.out.println("Player 1 wins battle " + battles + "\n");
				battles++;
			} else if (p1.getCardValue() < p2.getCardValue()) {
				collect(p2Deck);
				System.out.println("Player 2 wins battle " + battles + "\n");
				battles++;
			} else {
				System.out.println("Stalemate! Random Winner Choosen\n");
				int winner = (int)(Math.random() * (2));
				if(winner == 1) {
					collect(p1Deck);
					System.out.println("Player 1 wins battle " + battles + "\n");
					battles++;
				} else if(winner == 2) {
					collect(p2Deck);
					System.out.println("Player 2 wins battle " + battles + "\n");
					battles++;
				}
			}
			
			//print size of decks
			printDeckSize(p1Deck, 1);
			printDeckSize(p2Deck, 2);
			System.out.println("");
		}
		
		System.out.println("Player " + checkWinner() + " wins!");
		
	}
	
	
	

	//NICE CLEAN MAIN METHOD :)
	public static void main(String[] args){
	
	new War();
	
	}
}
