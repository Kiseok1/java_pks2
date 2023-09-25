package p0914;

import java.util.ArrayList;

public class Buyer {
	String id;
	String name;
	int money=10000000;
	int bonusPoint=0;
	
	Buyer(){}
	Buyer(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	ArrayList list = new ArrayList();
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
	}
	

}
