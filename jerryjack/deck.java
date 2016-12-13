package jerryjack;

import java.util.Random;

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
				this.crds[index++]=temp; 
			}
	}//end constructor
	
	public void shuffle() { 
		int srcatch[] = new int[STANDARD_DECK];
		cards cds[] = new cards[STANDARD_DECK];
		
		for (int k=0; k < STANDARD_DECK; k++) {
			srcatch[k] = k;
			cds[k] = new cards();
		}
		
		shuffleArray(srcatch);
		
		int index=0;
		for (int k=0; k < STANDARD_DECK; k++) {
			index=srcatch[k];
			cds[k]=this.crds[index];
		}
		this.crds = cds;
	}
	
	/*
	 * SOURCE - http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
	 * DATE - 13DEC16
	 */
	private void shuffleArray(int[] array)
	{
	    int index, temp;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = array[index];
	        array[index] = array[i];
	        array[i] = temp;
	    }
	}
	
}//end class
