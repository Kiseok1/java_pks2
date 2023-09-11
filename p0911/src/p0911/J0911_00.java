package p0911;

import java.util.Scanner;

public class J0911_00 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Card 클래스 이용
		// 카드 52장 생성 및 출력

//		String[] shape = {"Diamond","Clover","Heart","Spade"};
//		
//		Card[] c = new Card[52];
//		for (int i=0;i<c.length;i++) {
//			c[i] = new Card();
//			c[i].kind = shape[i/13];
//			c[i].number = (i%13)+1;
//			c[i].cardPrint();
//		}

		// 수 입력 후 사칙연산

//		int result = 0;
//		int[] n = new int[3];
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i=0;i<n.length;i++) {
//			System.out.println((i+1)+"번째수를 입력하세요");
//			n[i] = scan.nextInt();
//		}
//		
//		result = add(n);
//		System.out.println("더하기 값 : "+result);
//		
//		result = subtract(n);
//		System.out.println("빼기 값 : "+result);
//		
//		result = multiply(n);
//		System.out.println("곱하기 값 : "+result);
//		
////		result = divide(n);
////		System.out.println("나누기 값 : "+result);
//		
//		J0911_00 j = new J0911_00();
//		result = j.divide(n);
//		System.out.println("나누기 값 : "+result);

		// 학번,이름,국어점수 출력(메서드 활용)

		System.out.println("학번을 입력하세요");
		int stuNum = scan.nextInt();
		String name = nameInput();
		int kor = korInput();

		System.out.println("학번 : " + stuNum);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);

	}// main

//	static int add(int[] n) {
//		int result = n[0];
//		for (int i=1;i<n.length;i++) {
//			result = result + n[i];
//		}
//		return result;
//	}
//	
//	static int subtract (int[] n) {
//		int result = n[0];
//		for (int i=1;i<n.length;i++) {
//			result = result - n[i];
//		}
//		return result;
//	}
//	
//	static int multiply (int[] n) {
//		int result = n[0];
//		for (int i=1;i<n.length;i++) {
//			result = result * n[i];
//		}
//		return result;
//	}
//	
////	static int divide (int[] n) {
////		int result = n[0];
////		for (int i=1;i<n.length;i++) {
////			result = result/n[i];
////		}
////		return result;
////	}
//	
//	int divide (int[] n) {
//		int result = n[0];
//		for (int i=1;i<n.length;i++) {
//			result =result/n[i];
//		}
//		return result;
//	}

	static String nameInput() {

		System.out.println("이름을 입력하세요");
		String name = scan.next();
		return name;
	}

	static int korInput() {

		System.out.println("국어 점수를 입력하세요");
		int kor = scan.nextInt();
		return kor;
	}

}// class
