package p0905;

import java.util.Scanner;

public class J0905_17 {

	public static void main(String[] args) {
		// 1-100 랜덤 숫자를 생성해서 맞추는 프로그램을 구현하시오
		// 1.1-100랜덤 숫자 생성
		// 2.입력
		// 3.비교
		// 4.출력

		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10]; // 입력된 숫자 저장 배열
		int number = 0; // 입력한 숫자
		int count = 0; // 도전 횟수
		int random = 0; // 랜덤 숫자

		random = (int) (Math.random() * 100) + 1; //100개의 랜덤숫자를 생성(1-100)
		//random=10;
		while ( true ) {
			System.out.println((count+1)+"번재숫자를 입력하세요");
			number = scan.nextInt();
			arrNum[count]= number; //배열에 입력한 숫자저장
			System.out.println("입력한 숫자 : "+number);
			if(number==random) {
				System.out.println("정답입니다.");
				break;
			}else if (number<random) {
				System.out.println("입력한 수보다 큰 수입니다.");
			}else {
				System.out.println("입력한 수보다 작은 수입니다.");
			}
			count++;
			if(count>9) { // 입력한 횟수가 10번인지 확인
				System.out.println("10번 완료! 프로그램 종로합니다.");
				count--;
				break;
			}
						
		}//while
		
		//배열에 저장된 입력한 숫자 출력
		System.out.print("입력한 수 : ");
		for(int i=0;i<count+1;i++) {
			if (i==0) {
				System.out.print(arrNum[i]);
			}else {
				System.out.print(","+arrNum[i]);
			}
		}
		System.out.println();
		//도전 횟수 출력
		System.out.println("도전 횟수 : "+(count+1));
		
		//랜덤 숫자 출력
		System.out.println("랜덤 숫자 : "+random);

	}// main

}// class
