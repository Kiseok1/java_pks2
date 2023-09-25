package p0915;

import java.util.ArrayList;
import java.util.Scanner;

public class T0915_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		StuAction sA = new StuAction();
		int stuCount = 1;

		while (true) {
			int choice = sA.mainPrint();
//		System.out.println("=======================================");
//		System.out.println("           [ 성적 관리 프로그램 ]");
//		System.out.println("=======================================");
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("3. 성적수정");
//		System.out.println("4. 성적삭제");
//		System.out.println("5. 성적검색");
//		System.out.println("6. 등수처리");
//		System.out.println("0. 프로그램 종료");
//		System.out.println("---------------------------------------");
//		System.out.println("원하시는 번호를 입력하세요");
//		int choice = scan.nextInt();

			switch (choice) {
			case 1:
//				while (true) {
//
//					System.out.println("=======================================");
//					System.out.println("            [ 성적   입력 ]");
//					System.out.println("=======================================");
//					System.out.printf("%d번째 학생의 이름을 입력하세요(0.이전 페이지 이동)\n", stuCount);
//					String name = scan.next();
//					if (name.equals("0")) {
//						System.out.println("이전 페이지로 이동합니다.");
//						break;
//					}
//					System.out.printf("%s의 국어 점수를 입력하세요\n", name);
//					int kor = scan.nextInt();
//					System.out.printf("%s의 영어 점수를 입력하세요\n", name);
//					int eng = scan.nextInt();
//					System.out.printf("%s의 수학 점수를 입력하세요\n", name);
//					int math = scan.nextInt();
//					StuScore s = new StuScore(name, kor, eng, math);
//					sA.list.add(s);
//					stuCount++;
//				}//while(입력)
				stuCount = sA.stuInput(stuCount);
				break;
				
			case 2: 
				System.out.println("=======================================");
				System.out.println("            [ 성적   출력 ]");
				System.out.println("=======================================");
			    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","총점","평균","등수");
			    System.out.println("==================================================================");
				for (int i=0;i<sA.list.size();i++) {
					StuScore s = sA.list.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				}
				break;
			}//switch

		} // while

	}// main

}// class
