package p0920;

import java.util.Scanner;

public class J0920_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 16가1023456 - 랜덤으로 숫자를 생성해서 (글자는 '가'고정) 입력한 값과 비교해서 맞는 개수를 출력하시오
		// 26나2320411
		// 맞는 개수 : 3개

		while (true) {
			int random1 = (int) (Math.random() * 100);
			String rno1 = String.format("%02d", random1);
//		System.out.println(rno1);
			rno1 += "가";
//		System.out.println(rno1);
			int random2 = (int) (Math.random() * 10000000);
			String rno2 = String.format("%07d", random2);
//		System.out.println(rno2);
			rno1 += rno2;
//		System.out.println(rno1);

			System.out.println("번호를 입력하세요");
			String input = scan.next();
			System.out.println();
			// 길이가 잘못 입력되었다면 다시 입력하세요
			if (input.length() != 10) {
				System.out.println("잘못 입력하셨습니다. 10자리로 다시 입력하세요");
				System.out.println();
				continue;
			}
			int count = 0;
			for (int i = 0; i < rno1.length(); i++) {
				if (rno1.charAt(i) == input.charAt(i)) {
					count++;
				}
			}
			System.out.println("랜덤번호 : " + rno1);
			System.out.println("입력번호 : " + input);
			System.out.println("맞는 개수 : " + count);
			System.out.println();

		}

	}// main

}// class
