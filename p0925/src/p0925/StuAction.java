package p0925;

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
	ArrayList<StuScore> list = new ArrayList<StuScore>();
	Scanner scan = new Scanner(System.in);
	
	void stuInput() {
		System.out.println("[ 성적 입력 ]");
		while(true) {
			int count = list.size()+1;
			System.out.println(count + "번째 학생의 이름을 입력하세요(0.이전페이지)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println(name + "의 국어성적을 입력하세요");
			int kor = scan.nextInt();
			System.out.println(name + "의 영어성적을 입력하세요");
			int eng = scan.nextInt();
			System.out.println(name + "의 수학성적을 입력하세요");
			int math = scan.nextInt();

			list.add(new StuScore(name, kor, eng, math));
			System.out.println("성적이 입력되었습니다.");
			System.out.println();
			
		}
	}//stuInput
	
	void stuOutput() {
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"번호","이름","국어","영어","수학","총점","평균","등수");
		System.out.println("--------------------------------------------------------------");
		for (int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
		}
		System.out.println();
	}//stuOutput
	
	void stuUpdate() {
		while(true) {
			int t=0;
			int check=0;
			System.out.println("[ 성적 수정 ]");
			System.out.println("수정하려는 학생의 이름을 입력하세요.(0.이전페이지 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			for (t=0;t<list.size();t++) {
				if(name.equals(list.get(t).getName())) {
					System.out.println("입력하신 학생을 찾았습니다.");
					System.out.println();
					check = 1;
					break;
				}
			}
			if(check==0) {
				System.out.println("입력하신 학생을 찾지 못했습니다. 다시 입력해주세요");
				System.out.println();
				continue;
			}
			System.out.println("학생성적 수정");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.println("수정을 원하시는 과목을 선택하세요");
			int choice = scan.nextInt();
			
			StuScore st = list.get(t);
			switch(choice) {
			case 1:
				System.out.println("현재 "+name+"의 국어 성적 : "+st.getKor());
				System.out.println("수정하려는 점수를 입력하세요");
				int update = scan.nextInt();
				st.setKor(update);
				st.setTotal(st.getKor()+st.getEng()+st.getMath());
				st.setAvg(st.getTotal()/3.0);
				System.out.println("성적 수정이 완료되었습니다.");
				System.out.println();
				break;
			case 2:
				System.out.println("현재 "+name+"의 영어 성적 : "+st.getEng());
				System.out.println("수정하려는 점수를 입력하세요");
				update = scan.nextInt();
				st.setEng(update);
				st.setTotal(st.getKor()+st.getEng()+st.getMath());
				st.setAvg(st.getTotal()/3.0);
				System.out.println("성적 수정이 완료되었습니다.");
				System.out.println();
				break;
			case 3:
				System.out.println("현재 "+name+"의 수학 성적 : "+st.getMath());
				System.out.println("수정하려는 점수를 입력하세요");
				update = scan.nextInt();
				st.setMath(update);
				st.setTotal(st.getKor()+st.getEng()+st.getMath());
				st.setAvg(st.getTotal()/3.0);
				System.out.println("성적 수정이 완료되었습니다.");
				System.out.println();
				break;	
			}
			
		}
	}//stuUpdate
	
	void stuDelete() {
		while(true) {
			int t=0;
			int check=0;
			System.out.println("[ 성적 삭제 ]");
			System.out.println("삭제하려는 학생의 이름을 입력하세요.(0.이전페이지 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			for (t=0;t<list.size();t++) {
				if(name.equals(list.get(t).getName())) {
					System.out.println("입력하신 학생을 찾았습니다.");
					System.out.println();
					check = 1;
					break;
				}
			}
			if(check==0) {
				System.out.println("입력하신 학생을 찾지 못했습니다. 다시 입력해주세요");
				System.out.println();
				continue;
			}
			System.out.println("학생성적 삭제");
			System.out.println("1. 삭제");
			System.out.println("2. 취소");
			System.out.println("원하시는 메뉴를 선택하세요");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: 
				list.remove(t);
				System.out.println("삭제가 완료되었습니다.");
				System.out.println();
				break;
				
			case 2:
				System.out.println("삭제가 취소되었습니다.");
				System.out.println();
				break;
			}
			
		}
	}//stuDelete
	
	void sort() {
		System.out.println("학번순 정렬");
		System.out.println("이름순 정렬");
		System.out.println("높은 성적순 정렬");
		System.out.println("낮은 성적순 정렬");
		System.out.println("원하시는 메뉴를 선택하세요");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			stuNumSort();
			break;
		case 2:
			nameSort();
			break;
		case 3:
			highSort();
			break;
		case 4: 
			lowSort();
			break;
		}
	}
	
	void stuNumSort() {
		Collections.sort(list, new Comparator<StuScore>() {
			
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getStuNum()-s2.getStuNum();
			}
		});
		System.out.println("학번순 정렬이 완료되었습니다.");
		System.out.println();
		stuOutput();
	} //stuNumSort

	
	void nameSort() {
		Collections.sort(list, new Comparator<StuScore>(){

			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
		});
		System.out.println("이름순 정렬이 완료되었습니다.");
		System.out.println();
		stuOutput();
	}//nameSort
	
	void highSort() {
		Collections.sort(list, new Comparator<StuScore>() {

			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal()-s1.getTotal();
			}
		});
		System.out.println("성적 높은순 정렬이 완료되었습니다.");
		System.out.println();
		stuOutput();
	} //highSort
	
	void lowSort() {
		Collections.sort(list, new Comparator<StuScore>() {
			
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getTotal()-s2.getTotal();
			}
		});
		System.out.println("성적 낮은순 정렬이 완료되었습니다.");
		System.out.println();
		stuOutput();
	} //lowSort
	
	void stuSave() throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/stuScore.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String saveData = "";
		for (int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", 
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
			
			saveData += line;
		}
		bw.write(saveData);
		bw.close();
		System.out.println("저장이 완료되었습니다.");
		System.out.println();
	}//stuSave
	
	void stuLoad() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stuScore.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if (line==null) break;
			String[] arrData = line.split(",");
			int stuNum = Integer.parseInt(arrData[0]);
			String name = arrData[1];
			int kor = Integer.parseInt(arrData[2]);
			int eng = Integer.parseInt(arrData[3]);
			int math = Integer.parseInt(arrData[4]);
			int total = Integer.parseInt(arrData[5]);
			double avg = Double.parseDouble(arrData[6]);
			int rank = Integer.parseInt(arrData[7]);
			
			list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank));
		}
		System.out.println("불러오기를 완료했습니다.");
		System.out.println();
	}//stuLoad
	
	void stuRank() {
		System.out.println("[ 등수 처리 ]");
		for (int i=0;i<list.size();i++) {
			int count = 1;
			StuScore st1 = list.get(i);
			for (int j=0;j<list.size();j++) {
				StuScore st2 = list.get(j);
				if (st1.getTotal()<st2.getTotal()) {
					count++;
				}
			} st1.setRank(count);
		}
		System.out.println("등수처리가 완료되었습니다.");
		System.out.println();
		stuOutput();
	} // stuRank

}//class
