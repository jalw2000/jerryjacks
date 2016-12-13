package jerryjack;

public class deck {
	private final int STANDARD_DECK = 52;
	public cards[] crds;

	public deck() {
		String cardRanks[] = { "DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK",
				"QUEEN", "KING", "ACE"};

		String cardSuits[] = { "HEARTS", "DIAMONDS", "CLUBS", "SPADES"};
		String rk=null;

		this.crds = new cards[STANDARD_DECK];

		int rankvalue=0,index=0;

		for (int i = 0; i < cardSuits.length; i++) 
			for (int j = 0; j < cardRanks.length; j++) {
				rk = cardRanks[j];
				if (rk == "DEUCE") rankvalue=2;
				else if (rk == "THREE") rankvalue=3;
				else if (rk == "FOUR") rankvalue=4;
				else if (rk == "FIVE") rankvalue=5;
				else if (rk == "SIX") rankvalue=6;
				else if (rk == "SEVEN") rankvalue=7;
				else if (rk == "EIGHT") rankvalue=8;
				else if (rk == "NINE") rankvalue=9;
				else if (rk == "TEN") rankvalue=10;
				else if (rk == "JACK") rankvalue=10;
				else if (rk == "QUEEN") rankvalue=10;
				else if (rk == "KING") rankvalue=10;
				else if (rk == "ACE") rankvalue=11;
				
				cards temp = new cards();
				temp.setCard(cardSuits[i], cardRanks[j], rankvalue);
				this.crds[index++]=temp; //there was a bug, that I can't assigned alias of the same object to each array location.
			}//end for
	}//end constructor
}//end class
