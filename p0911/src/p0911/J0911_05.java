package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 2개의 숫자를 입력받아 사칙연산을 출력하시오
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		int[] n = new int[2];
		int result = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println((i + 1) + "번째 수를 입력하세요");
			n[i] = scan.nextInt();
		}

		System.out.print("더하기 결과값 : ");
		result = add(n); //int[] n배열의 주소값을 매개변수로 보냄.
		System.out.println(result);

		System.out.print("빼기 결과값 : ");
		result = subtract(n);
		System.out.println(result);

		System.out.print("곱하기 결과값 : ");
		result = multiply(n);
		System.out.println(result);

		System.out.print("나누기 결과값 : ");
		result = divide(n); //클래스메서드 활용 -> 클래스명.메서드명 (동일 클래스 내라면 생략가능)
		System.out.println(result);
		
//		J0911_05 j = new J0911_05(); // 인스턴스메서드 활용 위한 객체선언
//		System.out.print("나누기 결과값 : ");
//		result = j.divide(n); //인스턴스메서드 활용 -> 참조변수명.메서드명
//		System.out.println(result);

	}// main

	static int add(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result + n[i];

		return result;
	}

	static int subtract(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result - n[i];
		return result;
	}

	static int multiply(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result * n[i];
		return result;
	}

	static int divide(int[] n) { //클래스메서드
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result / n[i];
		return result;
	}
	
//	int divide(int[] n) { //인스턴스메서드
//		int result = n[0];
//		for (int i=1;i<n.length;i++) {
//			result = result / n[i];
//		}
//		return result;
//	}

}// class
