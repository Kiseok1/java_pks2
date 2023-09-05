package p0904;

import java.util.Scanner;

public class JA0904_09 {

	public static void main(String[] args) {
		// 1.두 수를 입력받고,
		// 2. +-*/를 선택해서
		// 3.그 값을 출력하시오.
		Scanner scan = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		char choice = ' ';
		int result = 0;
		System.out.println("첫번째 수");
		n1 = scan.nextInt();
		System.out.println("두번째 수");
		n2 = scan.nextInt();

		System.out.println("원하시는 사칙연산을 선택하세요(+,-,*,/)");
		choice = scan.next().charAt(0);
		switch (choice) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}// switch

		System.out.println("결과값 : " + result);

	}// main

}// class
