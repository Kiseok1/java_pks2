package p0914;

public class T0914_03 {

	public static void main(String[] args) {
		Tcar c;
		TFireEngine f1 = new TFireEngine();
		f1.go();
		f1.stop();
		f1.water();
		c= f1;
		System.out.println("-------------------");
		c.go();
		c.stop();
		System.out.println("--------------------");
		TFireEngine f2;
		f2 = (TFireEngine)c;
		f2.go();
		f2.stop();
		f2.water();
		
		

	}

}
