
public class Game {

	//VARIABLES
	
	
	public static void main(String[] args){
		Player play = new Player();
		
		while (play.gameOver() == false) {
			
			//deal player 1's card
			Card p1 = play.place(play.getp1Deck());
			play.print(p1, 1);
			
			//deal player 2's card
			Card p2 = play.place(play.getp2Deck());
			play.print(p2, 2);
			
			//check who has higher value
			if (p1.getCardValue() > p2.getCardValue()) {
				play.collect(play.getp1Deck());
				System.out.println("Player 1 wins battle");
			} else if (p1.getCardValue() < p2.getCardValue()) {
				play.collect(play.getp2Deck());
				System.out.println("Player 2 wins battle");
			} else {
				System.out.println("Stalemate! Retry round");
			}
			
		}
		
	}
	
	
	
	
	
	
	
}
