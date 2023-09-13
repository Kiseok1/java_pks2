package p0913;

public class Buyer {
	String id="aaa";
	String name="hong";
	int money = 10000000;
	int bonusPoint = 0;
	
	//다형성 활용하여 아래 메소드들을 하나로 간결화함
	void buy(Product p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
	}
	
	//TV를 구매했을때 사용하는 메소드
	void buy(TV t) {
		money = money - t.price;
		bonusPoint += t.bonusPoint;
	}
	//컴퓨터를 구매했을때 사용하는 메소드
	void buy(Computer c) {
		money = money - c.price;
		bonusPoint += c.bonusPoint;
	}
	
	
	
	
	
}
