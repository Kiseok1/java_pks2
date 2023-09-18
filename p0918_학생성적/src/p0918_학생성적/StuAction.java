package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan= new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	int stuMainPrint() {
		System.out.println(" [ 학생 성적 관리 프로그램 ] ");
		System.out.println("--------------------------------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------------------------------------");
		System.out.println("원하시는 항목을 선택하세요");
		int choice = scan.nextInt();
		
		return choice;
	}//mainprint
	
	int stuInput(int stuCount) {
		while(true) {
			
			System.out.println("학생성적입력");
			System.out.println("----------------------------------------------");
			System.out.printf("%d 번째 학생의 이름을 입력하세요.(0.이전페이지 이동)\n",stuCount);
			String name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.printf("%s 학생의 국어 성적을 입력하세요.\n",name);
			int kor = scan.nextInt();
			System.out.printf("%s 학생의 영어 성적을 입력하세요.\n",name);
			int eng = scan.nextInt();
			System.out.printf("%s 학생의 수학 성적을 입력하세요.\n",name);
			int math = scan.nextInt();
			
			list.add(new StuScore(name,kor,eng,math));
			System.out.println("입력이 완료되었습니다.");
			stuCount++;
			}//while 입력
		return stuCount;
	}//stuInput
	
	void stuOutput () {
		System.out.println("학생성적 출력");
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","총점","평균","등수");			
		System.out.println("------------------------------------------------------------");
		for (int i=0 ;i<list.size();i++) {
			StuScore s = (StuScore) list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println("------------------------------------------------------------");
		System.out.println();
	}//stuOutput
	
	void stuUpdate() {
		while (true) {

			System.out.println("학생성적 수정");
			System.out.println("성적 수정하려는 학생의 이름을 입력하세요(0.이전페이지 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				break;
			}
			int count = -1;
			for (int i = 0; i < list.size(); i++) {
				StuScore s = (StuScore) list.get(i);
				if (name.equals(s.getName())) {
					count = i;
					System.out.printf("%s 학생의 성적수정을 선택하셨니다.\n", name);
					System.out.println("수정하려는 과목을 선택하세요");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("-----------------------");
					int choice = scan.nextInt();

					switch (choice) {
					case 1:
						System.out.println("현재 국어 점수 : " + s.getKor());
						System.out.println("수정 점수를 입력하세요");
						s.setKor(scan.nextInt());
						s.setTotal(s.getKor() + s.getEng() + s.getMath());
						s.setAvg(s.getTotal() / 3.0);
						System.out.println("점수가 수정되었습니다.");
						System.out.println();
						break;

					case 2:
						System.out.println("현재 영어 점수 : " + s.getEng());
						System.out.println("수정 점수를 입력하세요");
						s.setEng(scan.nextInt());
						s.setTotal(s.getKor() + s.getEng() + s.getMath());
						s.setAvg(s.getTotal() / 3.0);
						System.out.println("점수가 수정되었습니다.");
						System.out.println();
						break;

					case 3:
						System.out.println("현재 수학 점수 : " + s.getMath());
						System.out.println("수정 점수를 입력하세요");
						s.setMath(scan.nextInt());
						s.setTotal(s.getKor() + s.getEng() + s.getMath());
						s.setAvg(s.getTotal() / 3.0);
						System.out.println("점수가 수정되었습니다.");
						System.out.println();
						break;

					}// switch 수정과목 선택

				} // if

			} // for
			if (count == -1) {
				System.out.printf("%s 학생이 존재하지 않습니다. 다시 입력해주세요\n", name);
				
			}
		} // while 성적수정
		
	}
		

	
	
	

}
