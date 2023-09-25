package j0913;

public class Deck {
	String[] shape = {"Spade","Diamond","Clover","Heart"};
	Card[] c = new Card[52];
	
	Deck() {
		for (int i=0;i<c.length;i++) {
			c[i] = new Card(shape[(i/13)],(i%13)+1);
		}
	}
	
	void print() {
		for (int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("----------------");
	}
	
	void shuffle () {
		Card temp;
		for (int i=0;i<500;i++) {
			int random = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	Card pick(int n) {
		return c[n];
	}

}
