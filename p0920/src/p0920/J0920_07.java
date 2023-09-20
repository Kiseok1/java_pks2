package p0920;

import java.util.Scanner;

public class J0920_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = new String(
				"(샌프란시스코=연합뉴스) 김태종 특파원 = 애플의 최신 스마트폰인 아이폰15 판매 우려가 커지는 가운데 사전 주문이 호조세를 보이고 있다는 분석이 나왔다.\r\n" + "\r\n"
						+ "모건스탠리는 18일(현지시간) 보고서에서 아이폰15의 리드타임(주문부터 실제 납품까지 걸리는 시간)과 사전 예약 판매가 \"우려했던 것보다 낫다\"고 밝혔다.\r\n"
						+ "\r\n" + "지난 12일 공개된 아이폰15 시리즈는 15일부터 사전 주문에 들어갔다."
						+ "모건스탠리는 아이폰15 프로 맥스의 리드타임은 평균 5∼6주 정도로 \"지난 7년 동안 출시된 모델 중 가장 길다\"고 썼다. "
						+ "프로 맥스는 아이폰 시리즈 가운데 애플이 주력하고 있는 최상위 모델이다.");

		System.out.println(str);
		
		while(true) {
			
		System.out.println("-------------------------");
		System.out.println("찾고자 하는 글자를 입력하세요.(0.프로그램 종료)");
		String search = scan.next();
		
		if(search.equals("0")) break;
		
		//특정문자를 찾아서 다른문자로 변경 - replace
		
//		System.out.println(str);
//		System.out.println("---------------------------------------------------");
//		String str3 = str.replaceAll(" ", "");
//		System.out.println(str3);

		//아이폰15가 몇개 있는지 출력하시오.
//		int count = 0;
//		int result = 0;
//		while(true) {
//			result = str.indexOf("아이폰15", result+1);
//			if (result==-1) break;
//			count++;		
//		}
//		System.out.println(count);
		
		String[] s = str.split(" ");
		int count = 0;
		for (int i=0;i<s.length;i++) {
			int n = s[i].indexOf(search);
			if(n!=-1) count++;
		}
		
		System.out.println(count);
		
		}//while
		
		
		
		
	}// main

}// class
