package p0904;

import java.util.Scanner;

public class JA0904_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//두 수를 입력받아, 두 수의 곱을 맞추는 프로그램 구현
		//두 수를 입력받아 출력하시오
		//두 수의 곱의 정답을 입력해서 맞으면 정답, 틀리면 오답이라고 출력
		
//		System.out.println("첫번째 수를 입력하세요");
//		int n1 = scan.nextInt();
//		System.out.println("두번째 수를 입력하세요");
//		int n2 = scan.nextInt();
//		System.out.println("입력받은 수는 "+n1+", "+n2+"입니다.");
//		System.out.println("-----------------------------------");
//		
//	    int result = n1*n2;
//	    System.out.println(n1+" X "+n2+" = ?");
//	    int num = scan.nextInt();
//	    if (num==result) {
//	    	System.out.println("정답입니다.");
//	    } else {
//	    	System.out.println("오답입니다.");
//	    }
		
//		System.out.println("5*4는 얼마일까요?");
//		int score = scan.nextInt();
//		if (score==20) {
//			System.out.println("정답입니다");
//		} else {
//			System.out.println("오답입니다");
//		}
		
		System.out.println("사랑은 영어로 무엇일까요?");
		String result = scan.next();
		if(result.equalsIgnoreCase("love")) { //8가지 기본타입이 아닌 경우, equals명령어 사용(Ctrl+click)
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
		

	}//main
}//class
