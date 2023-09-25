package p0914;

import java.util.ArrayList;

public class TBuyer {
	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;

	TBuyer() {
	}

	TBuyer(String id, String name) {
		this.id=id;
		this.name=name;
	}
	
	ArrayList list = new ArrayList(); 
	
	void buy(TProduct p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
	}
	
	

}
