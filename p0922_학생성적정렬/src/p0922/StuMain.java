package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int choice = 0;
		
		//시작시 파일 가져오기
		s.stuFOpen();
		s.stuOutput();

		loop: while (true) {
			System.out.println("----------------------");
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("----------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적높은순 정렬");
			System.out.println("7. 성적낮은순 정렬");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장");
			System.out.println("10. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------");
//			String strCh = JOptionPane.showInputDialog("원하는 번호를 입력하세요.");
//			choice = Integer.parseInt(strCh);
			choice = scan.nextInt();
			System.out.println();

			switch (choice) {
			case 1: //학생성적입력
				s.stuInput();
				break;
			case 2: //학생성적출력
				s.stuOutput();
				break;
			case 3: //학생성적수정
				s.stuUpdate();
				break;
			case 4: //성적 삭제
				s.stuDelete();
				break;
			case 5: //이름순 정렬
				s.stuNameSort();		
				break;
			case 6: //성적높은순 정렬
				s.stuTotalHighSort();		
				break;
			case 7: //성적낮은순 정렬
				s.stuTotalLowSort();		
				break;
			case 8: //파일 가져오기
				s.stuFOpen();
				break;
			case 9: //파일 저장
				s.stuFSave();
				break;
			case 10: //성적처리
				s.stuRank();
				break;
			case 0:
				System.out.println("[[ 프로그램 종료 ]]");
				System.out.println();
				break loop;
			}// switch

		} // while 무한반복

	}// main

}// class
