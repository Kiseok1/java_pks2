package p0911;

import java.util.Scanner;

public class J0911_00 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Card 클래스 이용
		// 카드 52장 생성 및 출력
		
		// 수 입력 후 사칙연산

		// 학번,이름,국어점수 출력(메서드 활용)
		
		int stuNum = 0;
		System.out.println("학번 입력");
		stuNum = scan.nextInt();
		
		String name = nameInput();
		int kor = korInput();
		
	    System.out.println("학번 : "+stuNum);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		

		

	}// main
	
	static String nameInput () {
		System.out.println("이름 입력");
		String name = scan.next();
		
		return name;
	}
	
	static int korInput() {
		System.out.println("국어점수 입력");
		int kor = scan.nextInt();
		
		return kor;
	}

	
}// class



