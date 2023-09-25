package t0921;

public class T0921_01 {

	public static void main(String[] args) {
		int no1 = 5;
		int no2 = 15;
		int no3 = 2;
		
		int m1=0,m2=0,m3=0;
		
		m1 = Math.min(Math.min(no1, no2), no3);
		m3 = Math.max(Math.max(no1, no2), no3);
		m2 = (no1+no2+no3) - m1-m3;
		
		System.out.printf("%d, %d, %d",m1,m2,m3);

	}

}
