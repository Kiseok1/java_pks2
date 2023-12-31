package p0920;

public class J0920_15 {

	public static void main(String[] args) {
		int a = -5;
		System.out.println(Math.abs(a)); //절대값
		
		double b = 12.912;
		System.out.println(Math.ceil(b));   // 소수점 첫째자리 올림
		System.out.println(Math.floor(b));  // 소수점 첫째자리 버림
		System.out.println(Math.round(b));  // 소수점 첫째자리 반올림
		
		System.out.println("---------------------------");
		int no1 = 5;
		int no2 = 15;
		int no3 = 2;
		
		System.out.println(Math.max(no1, no2)); //최대값추출
		System.out.println(Math.min(no1, no2)); //최소값추출
		
		System.out.println("---------------------------");
		//no1,no2,no3 최대값과 최고값을 출력하시오.
		System.out.println(Math.max(no3,(Math.max(no1,no2))));
		System.out.println(Math.min(no3,(Math.min(no1,no2))));
		
		
		System.out.println("----------------------------");
		//퀴즈
		//no1,no2,no3 적은 숫자 순으로 출력하시오 10, 13, 15 출력
		int min = Math.min(no3,(Math.min(no1,no2)));
		int max = Math.max(no3,(Math.max(no1,no2)));
		int middle = Math.max(no3,(Math.min(no1,no2)));
		
		System.out.println(min+","+middle+","+max);
		
		System.out.println("------------------------------");
		
		
		
		
		

	}//main

}//class
