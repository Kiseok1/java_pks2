package p0911;

import java.util.Scanner;

public class J0911_04 {

	public static void main(String[] args) {
		int a = 0; // 지역변수
		int b = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1번째 수를 입력하세요(0:프로그램 종료)");
			a = scan.nextInt();
			if (a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("2번째 수를 입력하세요");
			b = scan.nextInt();

//			J0911_04 j = new J0911_04(); // 객체선언
			int result = J0911_04.max(a, b); // 같은 클래스 내에 선언되어 있으면 클래스명 생략가능(J0911_04생략가능)
			// int result = max(a, b);
			System.out.println("큰수 : " + result);
		} // while

	}// main

	// static 있으면 클래스변수 - 객체선언없이 클래스명.변수명
	// static 없으면 인스턴스변수 - 객체선언후 참조변수명.변수명
	// static 있으면 클래스메서드 - 객체선언없이 클래스명.메서드명
	// static 없으면 인스턴스메서드 - 객체선언후 참조변수명.메서드명
	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}// class
