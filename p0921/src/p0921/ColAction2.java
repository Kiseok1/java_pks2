package p0921;

public class ColAction2 {
	
	Card[] c = new Card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	
	Card[] cardAll() {
		for (int i=0;i<c.length;i++) {
			c[i] = new Card((i%13)+1,shape[i/13]);
		}
		return c;
	}
	
	

}
