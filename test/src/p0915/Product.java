package p0915;

public class Product {
	String name;
	int price;
	int bonusPoint;
	
	@Override
	public String toString() {
		
		return String.format("%s, %,d ,%,d",name,price,bonusPoint);
	}

}
