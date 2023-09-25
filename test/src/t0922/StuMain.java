package t0922;

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
		int choice=0;
		
		
		
		loop:while(true) {
			System.out.println("-------------------------");
			System.out.println(" [ 학생성적처리 프로그램 ] ");
			System.out.println("-------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적높은순 정렬");
			System.out.println("7. 성적낮은순 정렬");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				s.stuInput();	
				break;
			case 2:
				s.stuOutput();
				break;
			case 3:
				System.out.println("[[ 학생성적 수정 ]]");
				System.out.println("수정할 학생의 이름을 입력하세요");
				String inputName = scan.next();
				int i= 0;
				int count = 0;
				for(i=0;i<s.list.size();i++) {
					StuScore st = s.list.get(i);
					if(inputName.equals(st.getName())) {
						System.out.println("학생을 찾았습니다.");
						count =1;
						break;
					}
				}
				if (count==0) {
					System.out.println("입력한 학생을 찾을 수 없습니다.");
					break;
				}
				System.out.println("-------------------------");
				System.out.println("1.국어 점수");
				System.out.println("2.영어 점수");
				System.out.println("3.수학 점수");
				System.out.println("-------------------------");
				System.out.println("원하는 번호를 입력하세요.>>");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("[[국어점수 수정]]");
					System.out.println("현재 국어점수 : "+s.list.get(i).getKor());
					System.out.println("수정할 점수를 입력하세요");
					
					s.list.get(i).setKor(scan.nextInt());
					s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()+s.list.get(i).getMath());
					s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
					break;
				case 2:
					System.out.println("[[영어점수 수정]]");
					System.out.println("현재 영어점수 : "+s.list.get(i).getEng());
					System.out.println("수정할 점수를 입력하세요");
					
					s.list.get(i).setEng(scan.nextInt());
					s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()+s.list.get(i).getMath());
					s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
					break;
				case 3:
					System.out.println("[[수학점수 수정]]");
					System.out.println("현재 수학점수 : "+s.list.get(i).getMath());
					System.out.println("수정할 점수를 입력하세요");
					
					s.list.get(i).setMath(scan.nextInt());
					s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()+s.list.get(i).getMath());
					s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
					break;
				}
				
				break;
			case 5:
				s.stuNameSort();
				break;
			case 6:
				s.stuTotalHighSort();
				break;
			case 7:
				s.stuTotalLowSort();
				break;
			case 8:
				s.stuFOpen();
				break;
			case 9:
				s.stuFSave();
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			}
			
		}

	}//main

}//class
