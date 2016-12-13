package jerryjack;

public class cards {
	private suits st;
	private ranks rk;
	
	public suits getSuit() {
		return st;
	}
	public void setSuit(suits st) {
		this.st = st;
	}
	public ranks getRank() {
		return rk;
	}
	public void setRank(ranks rk) {
		this.rk = rk;
	}
	public void setCard(String suitname, String rankname, int rankvalue) {
		suits s = new suits();
		ranks r = new ranks();
		
		//System.out.println("building new card with: " + rankname + " of " + suitname);
		
		s.setName(suitname);
		r.setName(rankname);
		r.setRankValue(rankvalue);
		
		this.st = s;
		this.rk = r;
	}
}
