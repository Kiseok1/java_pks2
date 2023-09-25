package p0914;

public class T0914_00 {

	public static void main(String[] args) {
		TAmbulance a1 = new TAmbulance();
		a1.color = "black";
		
		Tcar c1;
		c1 = a1;
		
		System.out.println(c1.color);
		c1.color = "blue";
		System.out.println(a1.color);
		
		//c1.siren(); //에러
		a1.siren();
		

	}

}
