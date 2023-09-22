package p0922_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	ArrayList<StuScore> list = new ArrayList();
	Scanner scan = new Scanner(System.in);
	int i =0;
	int check=0;
	void stuInput() {
		while(true) {
			System.out.println("학생성적입력");
			System.out.println("----------------");
			System.out.println((list.size()+1)+"번째 학생의 이름을 입력하세요(0.이전페이지 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				break;
			}
			System.out.println("국어 점수를 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			int math = scan.nextInt();
			System.out.println();
			
			list.add(new StuScore(name,kor,eng,math));
			
		}
	}
	
	void stuOutput() {
		System.out.println("학생성적출력");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","총점","평균","등수");
		System.out.println("----------------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
		}
		System.out.println();
	}
	
	void stuUpdate() {
		while(true) {
			System.out.println("성적수정할 학생의 이름을 입력하세요(0.이전페이지 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				break;
			}
			for(i = 0;i<list.size();i++) {
				StuScore st = list.get(i);
				if (name.equals(st.getName())) {
					check = 1;
					break;
				}
			}
			if(check==0) {
				System.out.println("학생을 찾지 못했습니다.다시 검색해주세요");
				continue;
			}
			
			
			System.out.println("수정하실 과목을 선택하세요");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.println("----------------------");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("현재 국어점수 : "+list.get(i).getKor());
				System.out.println("수정할 점수를 입력하세요");
				list.get(i).setKor(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				break;
			case 2:
				System.out.println("현재 영어점수 : "+list.get(i).getEng());
				System.out.println("수정할 점수를 입력하세요");
				list.get(i).setEng(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				break;
			case 3:
				System.out.println("현재 수학점수 : "+list.get(i).getMath());
				System.out.println("수정할 점수를 입력하세요");
				list.get(i).setMath(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				break;
			}//과목선택 switch
		}//while
	}
	
	void stuLoad() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] strData = line.split(",");
			int stuNum = Integer.parseInt(strData[0]);
			String name = strData[1];
			int kor = Integer.parseInt(strData[2]);
			int eng = Integer.parseInt(strData[3]);
			int math = Integer.parseInt(strData[4]);
			int total = Integer.parseInt(strData[5]);
			double avg = Double.parseDouble(strData[6]);
			int rank = Integer.parseInt(strData[7]);
			
			list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank)); 
			
			
		}
	}//stuLoad

}
