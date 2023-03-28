
public class findSeat {
	private String suit;
	private String rank;
	

	public findSeat(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}	
	
public findSeat() {
		
		this.suit = "Seat:";
		this.rank = "Seat:";
		
	}
	
public String getSuit() {
	return suit;
}
public String getRank() {
	return rank;
}
	
private void setSuit(String suit) {
	
	this.suit = suit;
}

private void setRank(String rank) {
	
	this.rank = rank;
	
}

public boolean equals(findSeat a) {
	if(this.getRank().equals(a) && this.getSuit().equals(a)) {
		return true;
	}
	else 
		return false;
	}

public findSeat clone() {
	return new findSeat(suit,rank);
}


public String toString() {
	return "Seat: " + suit + rank;

}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
