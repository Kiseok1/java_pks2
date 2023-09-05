package p0905;

public class J0905_06 {

	public static void main(String[] args) {
		
		//1-100까지 순번과 합을 출력하시오
		//for문
		//while문
		
		//for
//		int sum=0;
//		for (int i=1;i<=100;i++) {
//			sum = sum +=i;
//			System.out.printf("순번 : %3d, 합 : %4d \n",i,sum);
//		}
		
		//while
		int i= 1;
		int sum =0;
		while (i<=100) {
			sum = sum += i;
			System.out.printf("순번 : %3d, 합 : %4d \n",i,sum);
			i++;
		}
		
		
		//구구단  while
//		int i=2;
//		while (i<=9) {
//			int j=1;
//			while(j<=9) {
//				System.out.printf("%d * %d = %d \n",i,j,(i*j));
//				j++;
//			}
//			i++;
//		}
		
		//구구단
//		for (int i=2;i<=9;i++) {
//			for (int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \n",i,j,(i*j));
//			}
//		}
		
//		int i = 10;
//		while (i<=10 && i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
		//초기화는 while문 안에 넣으면 안됨
//		int i = 10;
//		while(i>=0) {
//			// i=10;
//			System.out.println(i);
//			i--;
//		}
		
		// while
//		int i = 10;
//		while (i >= 0) {
//			System.out.println(i);
//			i--;
//		}

//		for(int i = 10; i>=0 ;i--) {
//			System.out.println(i);
//		}

	}// main

}// class
