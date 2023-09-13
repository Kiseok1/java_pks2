package p0913;

public class Card {
	String kind;
	int number;
	String[] front = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private int flag;
	
	Card (){}
	
	Card (String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	
	public String toString() {
		return String.format("[ %7s, %2s ] ",kind,front[number]); //주소값을 카드형태로 변환?
	}

}
