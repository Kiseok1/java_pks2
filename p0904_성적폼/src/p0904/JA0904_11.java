package p0904;

public class JA0904_11 {

	public static void main(String[] args) {
		//1부터 100까지의 합 : 5050
		//1부터 100까지의 합에서 합이 200을 넘는 때는 언제일까요? i와 sum을 출력하세요
		
		//1.1부터 100까지의 합을 구함
		//2.조건문을 사용해서 sum 200이상일때를 구함.
		
		int i=0;
		int sum=0;
		for (i=1;i<=100;i++) {
			sum=sum+i;
			if (sum>=200) {
				System.out.printf("200을 넘는 최초의 i : %d, sum : %d \n",i,sum);
				i = 101;
			} 
		}
		
		// 1부터 100까지의 합을 출력하시오
//		int i = 0;
//		int sum = 0;
//		for (i = 1; i <= 100; i++) {
//			sum = sum + i;
//		}
//		System.out.printf("1부터 %d 까지 합계 : %d",i-1,sum);

//		int i=0;
//		int sum=0;
//		for(i=1;i<=10;i++) {
//			System.out.println(i);
//			sum=sum+i;
//		}
//		
//		System.out.println("for문 밖 i : "+i); //for문 내에서 선언한 값은 밖에서 안됨(for문 밖에서 미리 지정해야함)
//		System.out.println("for문 밖 sum : "+sum); 

	}// main

}// class
