package p0905;

public class J0905_03 {

	public static void main(String[] args) {
		
		//1부터 100까지 1,3,5,7....합계를 구해보기
		
		int i = 0;
		int sum = 0;
		for (i=1;i<=100;i+=2) {
			sum = sum += i;
			System.out.printf("순번 : %2d, ",i);
			System.out.printf("합계 : %4d \n",sum);
		}
		
		
//		int i = 0;
//		int sum = 0;
//		for(i=0;i<=100;i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		
//		System.out.println("i : "+(i-1));
//		System.out.println("sum : "+sum);

	}//main

}//class
