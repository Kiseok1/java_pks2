package p0920;

import java.util.Scanner;

public class J0920_05 {

	public static void main(String[] args) {
		// 주민번호 880101-1101111
		// 1,2 1900년대생 3,4 2000년대생
		// 입력한 주민번호를 확인해서 나이를 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String input = scan.next();
		if (input.charAt(7)=='1' || input.charAt(7)=='2') {
			String b = 19+input.substring(0,2);
			int bd = Integer.parseInt(b);
			int result = 2023 - bd;
			System.out.println(result+"살");
		} else {
			String b = 20+input.substring(0,2);
			int bd = Integer.parseInt(b);
			int result = 2023 - bd;
			System.out.println(result+"살");
		}
		
		//계절확인
		
		int month = Integer.parseInt(input.substring(2,4));
		switch(month) {
		case 12:
		case 01:	
		case 02:
			
			System.out.println("당신이 태어난 계절 : 겨울");
			break;
		
		case 03:
		case 04:	
		case 05:
			
			System.out.println("당신이 태어난 계절 : 봄");
			break;
		
		case 06:
		case 07:	
		case 8:
			
			System.out.println("당신이 태어난 계절 : 여름");
			break;
		
		case 9:
		case 10:	
		case 11:
			
			System.out.println("당신이 태어난 계절 : 가을");
			break;
		
		
		
		
		}
		

	}//main

}//class
