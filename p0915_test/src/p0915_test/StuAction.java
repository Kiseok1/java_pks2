package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();

	StuAction() {
	}

	int mainPrint() {

		System.out.println("---------------------------------------");
		System.out.println("           [ 학생성적 프로그램 ]");
		System.out.println("---------------------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		return choice;
	}

	int stuInput(int stuCount) {
		while (true) {

			System.out.printf("%d번째 학생의 이름을 입력하세요(0.이전페이지 이동)\n", stuCount);
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				break;
			}
			System.out.println("국어점수를 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			stuCount++;
		} // while

		return stuCount;
	}
	
	void stuOutput() {
		System.out.println("-------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호", "이름", "국어", "영어", "수학", "총점", "평균", "등수");
		System.out.println("-------------------------------------------------------");
		for (int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());	
		}
		System.out.println("---------------------------------------------------------");
	}

}
