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
}
