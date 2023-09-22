package p0922_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int count = 0;
		int i = 0;
		int check = 0;
		loop: while (true) {
			System.out.println("학생 성적 관리 프로그램");
			System.out.println("1.학생성적 입력");
			System.out.println("2.학생성적 출력");
			System.out.println("3.학생성적 수정");
			System.out.println("8.파일 불러오기");
			System.out.println("9.파일 저장하기");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------------");
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
			case 8:
				s.stuLoad();
				break;
			case 9:
				FileWriter fw = new FileWriter("c:/cba/stu1.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				String strData = "";
				for (i = 0; i < s.list.size(); i++) {
					StuScore st = s.list.get(i);
					String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", st.getStuNum(), st.getName(), st.getKor(),
							st.getEng(), st.getMath(), st.getTotal(), st.getAvg(), st.getRank());
//					strData += line;
					bw.write(line);
				}
				bw.close();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}

		} // while

	}// main

}// class
