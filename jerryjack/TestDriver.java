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
		
		showHeader();
		System.out.println("");
		
		
		dealer jerryJacksDealer = new dealer();
		player challenger1 = new player();
		
		challenger1.setName("Joshua Wilder");
		jerryJacksDealer.dealCards(challenger1,2);
		
		System.out.println("\nShowing the hand for player1");
		challenger1.showHand();
	}
}
