package p0915;

import java.util.ArrayList;

public class Buyer {
	String id;
	String name;
	int money;
	int bonusPoint;
	
	public Buyer(String id, String name) {
		this.id = id;
		this.name = name;
		this.money = 10000000;
		this.bonusPoint = 0;
	}
	
	public Buyer() {}
	
	
	ArrayList list = new ArrayList();
	
	void buy (Product p) {
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		list.add(p);
	}
	
	
	

}
