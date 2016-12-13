package jerryjack;

public class TestDriver {
	public static void showHeader() {
		System.out.println("********************************************");
		System.out.println("*                                          *");
		System.out.println("*        Welcome to JERRY JACKS!!          *");
		System.out.println("*                  v1.0                    *");
		System.out.println("*                                          *");
		System.out.println("********************************************");
	}
	
	public static void main(String[] args) {
		deck stddeck = new deck();
		cardPrinter cp = new cardPrinter();
		stddeck.shuffle();
		
		for (int i=0; i < 52; i++)
			cp.printCardSTD(stddeck.crds[i]);
		
	}
}
