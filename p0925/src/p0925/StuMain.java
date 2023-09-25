package p0925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();

		loop: while (true) {
			System.out.println("    [ 학생성적관리 프로그램 ]");
			System.out.println("--------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적 높은순 정렬");
			System.out.println("7. 성적 낮은순 정렬");
			System.out.println("8. 파일 저장하기");
			System.out.println("9. 파일 불러오기");			
			System.out.println("10. 등수 처리");			
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.println("원하시는 메뉴를 선택하세요");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				s.stuInput();
				break;
				
			case 2:
				s.stuOutput();
				break;
				
			case 3:
				s.stuUpdate();
				break;
				
			case 4: 
				s.stuDelete();
				break;
				
			case 5: 
				s.nameSort();
				break;
				
			case 6: 
				s.highSort();
				break;
				
			case 7:
				s.lowSort();
				break;
				
			case 8:
				s.stuSave();
				break;
			
			case 9:
				s.stuLoad();		
				break;
				
			case 10:
				s.stuRank();
				break;
				
			case 11:
				s.sort();
				break;
				
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}// 메뉴 switch

		} // while

	}// main

}// class
