package jerryjack;

import java.util.ArrayList;

public class player {
	public String name;
	public ArrayList<cards> hand; 
	
	public player() {
		hand = new ArrayList<cards>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addCard2Hand(cards card) {
		hand.add(card);
	}
	
	public void showHand() {
		cardPrinter cp = new cardPrinter();
		for (int i=0; i < hand.size(); i++)
			cp.printCardSTD(hand.get(i));
	}
}
