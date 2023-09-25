package t0920;

import java.util.Scanner;

public class T0920_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 주민번호 880101-1101111
		//       012345 789
		// 1,2 1900년대생 3,4 2000년대생
		// 입력한 주민번호를 확인해서 나이를 출력하시오
		
		System.out.println("주민번호 입력");
		String input = scan.next();
		String year = input.substring(0,2);
		if (input.charAt(7)=='1' || input.charAt(7)==2) {
			year = 19 +year;
			int yy= Integer.parseInt(year);
			System.out.println("나이 : "+(int)(2023-yy));
		} else {			
		year = 20 +year;
		int yy= Integer.parseInt(year);
		System.out.println("나이 : "+(int)(2023-yy));
		}
		

	}//main

}//class
