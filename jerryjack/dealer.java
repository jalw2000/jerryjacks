package jerryjack;

import java.util.ArrayList;
import java.util.Stack;

public class dealer {
	private String name;
	private ArrayList<cards> hand;
	public Stack<cards> dealerDeck;
	
	/**
	 * default constructor
	 */
	public dealer() {
		this.name = "Dealer";
		deck dck = new deck();
		dck.shuffle();
		
		dealerDeck = new Stack<cards>();
		for (int i=51; i >=0; i--){
			dealerDeck.push(dck.crds[i]);					
		}
		
		hand = new ArrayList<cards>();
	}
	
	public void dealCard(player aPlayer) {
		aPlayer.addCard2Hand( dealerDeck.pop());
	}
	
	public void dealCards(player aPlayer, int numCards) {
		for (int i=0; i < numCards; i++)
			aPlayer.addCard2Hand( dealerDeck.pop());
	}
	
	public void addCard2Hand(cards card) {
		this.hand.add(card);
	}
	
}
