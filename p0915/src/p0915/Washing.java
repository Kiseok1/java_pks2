package p0915;

public class Washing extends Product {
	String capacity;

	Washing() {
		name = "그랑데세탁기";
		price = 550000;
		bonusPoint = price / 100;
		capacity = "23Kg";
	}

	public String toString() {

		return String.format("%s, %d, %d", name, price, bonusPoint);
	}

}
