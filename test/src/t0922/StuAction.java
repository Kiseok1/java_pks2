package t0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();

	//학생성적입력
	void stuInput() {
		while(true) {
			int stuCount = list.size()+1;
			System.out.println(stuCount+"번째 학생의 이름을 입력하세요.(0.이전페이지 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("국어 성적을 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요");
			int math = scan.nextInt();
			
			list.add(new StuScore(name,kor,eng,math));
			
			System.out.println("학생성적이 저장되었습니다.");
			System.out.println();
			
		}
	}//stuInput
	
	//학생성적출력
	void stuOutput() {
		System.out.println("[[ 학생성적 출력 ]]");
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
		System.out.println("--------------------------------------------------------------------");
		for (int i=0;i<list.size();i++) {
			StuScore ss = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",ss.getStuNum(),ss.getName(),ss.getKor(),ss.getEng(),ss.getMath(),ss.getTotal(),ss.getAvg(),ss.getRank());
			
		}
		System.out.println();
	}//stuOutput
	
	
	//7.정렬
	//높은순
	void stuTotalHighSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal()-s1.getTotal();
			}
		});
	}
	
	//낮은순
	void stuTotalLowSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getTotal()-s2.getTotal();
			}
		});
	}
	
	//이름순
	void stuNameSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
	}
	
	
	//파일 가져오기
	void stuFOpen() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] data = line.split(",");
			int stuNum = Integer.parseInt(data[0]);
			String name = data[1];
			int kor = Integer.parseInt(data[2]);
			int eng = Integer.parseInt(data[3]);
			int math = Integer.parseInt(data[4]);
			int total = Integer.parseInt(data[5]);
			double avg = Double.parseDouble(data[6]);
			int rank = Integer.parseInt(data[7]);
			
			list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank));	
		}
		br.close();
		System.out.println("불러오기 완료");
		System.out.println();
	}//stuFOpen
	
	//파일 저장
	
	void stuFSave() throws Exception {
		FileWriter fw = new FileWriter("c:/cba/stu1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strData = "";
		for (int i=0;i<list.size();i++) {
			StuScore ss = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",
					ss.getStuNum(),ss.getName(),ss.getKor(),ss.getEng(),
					ss.getMath(),ss.getTotal(),ss.getAvg(),ss.getRank());
			strData += line;
		}
		bw.write(strData);
		bw.close();
	}
	
}//class
