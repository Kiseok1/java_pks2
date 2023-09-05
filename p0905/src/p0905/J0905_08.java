package p0905;

import java.util.Scanner;

public class J0905_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//랜덤 숫자 생성 1-100
		int random = (int)(Math.random()*100)+1;
		//System.out.println("임시 : "+random);
		System.out.println("[숫자 맞추기 게임]");
		
		//숫자 맞추기
		while(true) {
			System.out.println("1-100사이의 숫자를 입력하세요");
			int num = scan.nextInt();
			if (random == num) {
				System.out.println("정답입니다.");
				break;
			} else if(random > num) {
				System.out.println("입력한 수 보다 큰 수 입니다.");
				System.out.println();
			} else {
				System.out.println("입력한 수 보다 작은 수 입니다.");
				System.out.println();
			}
		}
		
		System.out.println("랜덤 숫자 : "+random);
		
//		int i = 0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}

	}//main

}//class
