package p0915;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		String[] title = {"번호","이름","국어","영어","수학","총점","평균","등수"};
		int stuCount = 1;
		

		// 무한반복
		while (true) {

			// 메인화면 출력부분 방법1
			int choice = stuAction.mainPrint();

			// 메인화면 출력부분 방법2
//			stuAction.mainPrint();
//			int choice = scan.nextInt();

			switch (choice) {
			case 1: 
				//1. 학생입력메소드
//				while (true) {
//
//					System.out.println();
//					System.out.println("[ 학생입력 ]");
//					System.out.printf("%d번째 학생 이름을 입력하세요.(0.이전페이지 이동) \n", stuCount);
//					String name = scan.next();
//					if (name.equals("0")) { //이전페이지 이동
//						System.out.println(">> 이전 페이지로 이동합니다.");
//						System.out.println();
//						break;
//					}
//					System.out.println("국어점수를 입력하세요");
//					int kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요");
//					int eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요");
//					int math = scan.nextInt();
//					// 학생성적 저장
//					stuAction.list.add(new StuScore(name, kor, eng, math));
//
//					System.out.printf("%d번째 학생성적이 저장되었습니다.\n", stuCount);
//					System.out.println();
//					stuCount++;
//				}//while 성적입력

				stuCount = stuAction.stuInput(stuCount);
				break;
			
			case 2: //학생성적출력
				
//				System.out.println();
//				System.out.println("[ 학생성적 출력] ");
//				System.out.println("--------------------------------------------------------------");
//				for (int i=0;i<title.length;i++) {
//					System.out.printf("%s\t",title[i]);
//				}
//				System.out.println();
//				System.out.println("--------------------------------------------------------------");
//				for (int i=0;i<stuAction.list.size();i++) {
//					StuScore s = stuAction.list.get(i); //지너릭스 이용 (형변환생략)
//					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//				}//for
//				System.out.println("--------------------------------------------------------------");
//				System.out.println();
				
				stuAction.stuOutput();
				break;
				
			case 3:
				
				break;

			}// switch
		} // while

	}// main

}// class
