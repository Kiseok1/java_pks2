package p0915;

public class Audio extends Product {
	String speakerPower;

	Audio() {
		name = "브릿지오디오";
		price = 300000;
		bonusPoint = price / 100;
		speakerPower = "30W";
	}

	public String toString() {

		return String.format("%s, %d, %d", name, price, bonusPoint);
	}

}
