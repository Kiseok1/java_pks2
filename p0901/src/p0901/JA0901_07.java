package p0901;

import java.util.Scanner;

public class JA0901_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("영문 문자1개를 입력하세요");
		String str = scan.nextLine(); // 문자열을 입력받음
		char ch = str.charAt(0); // String 첫번째 주소값을 문자로 입력

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("첫글자는 영문자입니다.");
		else
			System.out.println("첫글자는 영문자가 아닙니다.");

		System.out.println("입력한 글자 길이 : " + str.length()); // 입력한 글자 길이
		System.out.println("입력한 문자 : " + ch);

	}

}
