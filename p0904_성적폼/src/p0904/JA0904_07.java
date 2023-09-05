package p0904;

import java.util.Scanner;

public class JA0904_07 {

	public static void main(String[] args) {
		// 1부터 10까지의 랜덤 숫자 생성 후 출력
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 10) + 1;
        int n1=0,n2=0,n3=0;
		// 3개 숫자를 입력받아, 정답을 맞추는 프로그램을 구현하시오.
		// 1개 입력받아 맞는 확인 ->정답 오답 출력
		// 반복
		// 3개의 입력값을 출력 / 입력번호 : 1,9,7
		// 정답번호 : 5
        
        //첫번째
		System.out.println("첫번째 수");
		n1 = scan.nextInt();
		if (n1 == random) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		//두번째
		System.out.println("두번째 수");
		n2 = scan.nextInt();
		if (n2 == random) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		//세번째
		System.out.println("세번째 수");
		n3 = scan.nextInt();
		if (n3 == random) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
        System.out.printf("입력번호 %d %d %d \n",n1,n2,n3);
		System.out.println("정답번호 : " + random);

		// 랜덤 숫자 1-100까지 5개의 랜덤숫자를 생성해서 변수에 저장 후 출력하시오.
		// 숫자 중복가능

//		int num1 = (int)(Math.random()*100)+1;
//		int num2 = (int)(Math.random()*100)+1;
//		int num3 = (int)(Math.random()*100)+1;
//		int num4 = (int)(Math.random()*100)+1;
//		int num5 = (int)(Math.random()*100)+1;
//		
//		System.out.println("첫번째 수 : "+num1);
//		System.out.println("두번째 수 : "+num2);
//		System.out.println("세번째 수 : "+num3);
//		System.out.println("네번째 수 : "+num4);
//		System.out.println("다섯번째 수 : "+num5);

	}

}
