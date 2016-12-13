package jerryjack;

public class cardPrinter {
	
	public void printCardSTD(cards crds) 
	{
		int maxLine=14;
		String rankName=crds.getRank().getName();
		String suitName=crds.getSuit().getName();
		String rankNameFormat=null; 
		
		//print 1st line of card
		for (int i=0; i<maxLine; i++)
			System.out.print("+");
		System.out.println("");
		
		//print 2nd line of card
		if (rankName == "ACE")        rankNameFormat="A";
		else if (rankName == "DEUCE") rankNameFormat="2";
		else if (rankName == "THREE") rankNameFormat="3";
		else if (rankName == "FOUR")  rankNameFormat="4";
		else if (rankName == "FIVE")  rankNameFormat="5";
		else if (rankName == "SIX")   rankNameFormat="6";
		else if (rankName == "SEVEN") rankNameFormat="7";
		else if (rankName == "EIGHT") rankNameFormat="8";
		else if (rankName == "NINE")  rankNameFormat="9";
		else if (rankName == "TEN")   rankNameFormat="10";
		else if (rankName == "JACK")  rankNameFormat="J";
		else if (rankName == "QUEEN") rankNameFormat="Q";
		else if (rankName == "KING")  rankNameFormat="K";
		
		if (rankNameFormat == "10")
			System.out.println("+ " + rankNameFormat + "         +");
		else 
			System.out.println("+ " + rankNameFormat + "          +");
			
		//print 3rd line of card
		System.out.println("+            +");
		
		//print 4th line of card
		if (suitName == "DIAMONDS")    System.out.println("+  DIAMONDS  +");
		else if (suitName == "HEARTS") System.out.println("+   HEARTS   +");
		else if (suitName == "SPADES") System.out.println("+   SPADES   +");
		else if (suitName == "CLUBS")  System.out.println("+   CLUBS    +");
		
		//print 4th line
		System.out.println("+            +");
		
		//print 5th line
		if (rankNameFormat == "10") 
			System.out.println("+         " + rankNameFormat + " +");
		else
			System.out.println("+          " + rankNameFormat + " +");
			
		
		//print 6th line of card
		for (int i=0; i<maxLine; i++)
			System.out.print("+");
		System.out.println("");
	}
}
