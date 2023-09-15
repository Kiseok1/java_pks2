package p0915;

import java.util.ArrayList;

public class Buyer {
	String id;
	String name;
	int money=10000000;
	int bonusPoint=0;

	Buyer() {
	}

	Buyer(String id, String name) {
		this.id = id;
		this.name = name;
		
	}

	ArrayList list = new ArrayList();

	int buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		else {
			money -= p.price;
			bonusPoint += bonusPoint;
			list.add(p);
			return 1;	
		}
	}

}
