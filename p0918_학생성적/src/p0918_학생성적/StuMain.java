package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		StuAction sA = new StuAction();
		int stuCount = 1;

		while (true) {

//		System.out.println(" [ 학생 성적 관리 프로그램 ] ");
//		System.out.println("--------------------------------------------------");
//		System.out.println("1. 학생성적입력");
//		System.out.println("2. 학생성적출력");
//		System.out.println("3. 학생성적수정");
//		System.out.println("4. 학생성적삭제");
//		System.out.println("5. 학생성적검색");
//		System.out.println("6. 등수처리");
//		System.out.println("0. 프로그램 종료");
//		System.out.println("--------------------------------------------------");
//		System.out.println("원하시는 항목을 선택하세요");
//		int choice = scan.nextInt();
			int choice = sA.stuMainPrint();

			switch (choice) {
			case 1:
				stuCount = sA.stuInput(stuCount);
				break;

			case 2:
				sA.stuOutput();
				break;

			case 3:
				sA.stuUpdate();
				break;

			}// switch 메인페이지 선택

		} // while main

	}// main

}// class
