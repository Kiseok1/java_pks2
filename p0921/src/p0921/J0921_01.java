package p0921;

public class J0921_01 {

	public static void main(String[] args) {
		//
		// no1,no2,no3 최대값과 최고값을 출력하시오.
		
		int no1 = 5;
		int no2 = 15;
		int no3 = 2;
		
		int m1=0,m2=0,m3=0;
		m1 = Math.min(Math.min(no1, no2),no3);
		m3 = Math.max(Math.max(no1, no2),no3);
		m2 = (no1 + no2 +no3 ) -m1 -m3;
		
		System.out.printf("%d, %d, %d \n",m1,m2,m3);
		
		

	}// main

}// class
