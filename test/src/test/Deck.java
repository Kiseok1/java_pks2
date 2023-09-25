package test;

public class Deck {
	String[] shape = {"Spade","Heart","Clover","Diamond"};
	Card[] c = new Card[52];
	
	
	Deck(){
		for (int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13],((i%13)+1));
		}
	}
	
	void print() {
		for (int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	
	void shuffle() {
		Card temp;
		for (int i=0;i<500;i++) {
			int random = (int)(Math.random()*52);
			temp=c[0];
			c[0]=c[random];
			c[random]=temp;
		}
	}
	
	void pick() {
		int random = (int)(Math.random()*52);
		System.out.println(c[random]);
	}
	
	void pick(int n) {
		System.out.println(c[n]);
	}
	
//	void shuffle2() {
//		Card temp; //주소값 생성
//		for (int i=0;i<2;i++) {
//			int random = (int)(Math.random()*52);
//			temp=c[0]; //주소값을 덮어쓰기 (아래 3번을 진행하여 주소값을 바꾸는 로직?)
//			System.out.println(temp+", "+c[0]);
//			c[0]=c[random];
//			System.out.println(c[0]+", "+c[random]);
//			c[random]=temp;
//			System.out.println(c[random]+", "+temp);
//		}
//	}
	
	
	

	
}
