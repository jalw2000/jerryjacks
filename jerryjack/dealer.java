package jerryjack;

import java.util.ArrayList;

public class dealer {
	private String name;
	//private ArrayList<cards> hand;
	private ArrayList<deck> decks;
	private int deckCount;
	
	public dealer() {
		this.name = "Computer_Dealer";
		decks = new ArrayList<deck>();
		//hand = new ArrayList<cards>();
		
		//start with one deck.
		deck dk = new deck();
		decks.add(dk); 
		setDeckCount(1);
	}

	public int getDeckCount() {
		return deckCount;
	}

	public void setDeckCount(int deckCount) {
		this.deckCount = deckCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
