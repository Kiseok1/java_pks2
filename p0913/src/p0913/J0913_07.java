package p0913;

public class J0913_07 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		System.out.println("현재 잔액 : "+b1.money);
		TV t = new TV();
		System.out.println(t.price);
		b1.buy(t);
		System.out.println("현재 잔액 : "+b1.money);
		
		
		b1.buy(new Computer()); //컴퓨터 구매
		b1.buy(new Audio()); //오디오 구매
		

	}//main

}//class
