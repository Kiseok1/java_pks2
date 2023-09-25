package p0922;

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
	
	
	//1.학생성적입력 메소드
	void stuInput() {
		while (true) {
			int count = list.size() + 1;
			System.out.println("[[ 학생성적 입력 ]]");
			System.out.println(count + "번째 학생이름을 입력하세요.(0.이전페이지 이동)>>");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("국어 성적을 입력하세요>>");
			int kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요>>");
			int eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요>>");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			System.out.println("학생성적이 저장되었습니다.");
			System.out.println();
		}
	}//stuInput
	
	
	//2.학생성적출력
    void stuOutput() {
    	System.out.println("[[ 학생성적 출력 ]]");
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
		System.out.println("--------------------------------------------------------------------");
		for (int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),st.getMath(),
					st.getTotal(),st.getAvg(),st.getRank());
		}
		System.out.println();
    }//stuOutput
    
    //3.학생성적수정
    void stuUpdate() {
    	while(true) {
			System.out.println("[[ 학생성적 수정 ]]");
			System.out.println("수정할 학생이름을 입력하세요.(0.이전페이지 이동");
			String inputName = scan.next();
			if (inputName.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("입력된 이름으로 검색중........");
			int i = 0;     //검색되었을때 위치점을 저장하는 변수
			int count = 0; // 찾는 학생이 있는지 확인하는 변수
			for(i=0;i<list.size();i++) {
				StuScore st = list.get(i);
				if(inputName.equals(st.getName())) {
					System.out.println("입력된 이름으로 학생이 검색되었습니다.");
					count = 1;
					break; //for 나오기
				}//if
			}//for
			
			if(count==0) { //검색된 이름이 없으면 실행
				System.out.println("학생이 검색되지 않습니다. 다시 입력하세요");
				continue; 
			}// if 
			
			System.out.println("-------------------------");
			System.out.println("1.국어 점수");
			System.out.println("2.영어 점수");
			System.out.println("3.수학 점수");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("[[ 국어점수 수정 ]]");
				System.out.println("-------------------------");
				System.out.println("● 현재 국어점수 : "+list.get(i).getKor());
				System.out.println("변경할 국어점수를 입력하세요.>>");						
				list.get(i).setKor(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("-------------------------");
				System.out.println(list.get(i).getKor()+"점으로 국어점수가 수정되었습니다.");
				System.out.println();
				break;
			case 2: 
				System.out.println("[[ 영어점수 수정 ]]");
				System.out.println("-------------------------");
				System.out.println("● 현재 영어점수 : "+list.get(i).getEng());
				System.out.println("변경할 영어점수를 입력하세요.>>");						
				list.get(i).setEng(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("-------------------------");
				System.out.println(list.get(i).getEng()+"점으로 영어점수가 수정되었습니다.");
				System.out.println();
				break;
			case 3:
				System.out.println("[[ 수학점수 수정 ]]");
				System.out.println("-------------------------");
				System.out.println("● 현재 수학점수 : "+list.get(i).getMath());
				System.out.println("변경할 수학점수를 입력하세요.>>");						
				list.get(i).setMath(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("-------------------------");
				System.out.println(list.get(i).getMath()+"점으로 수학점수가 수정되었습니다.");
				System.out.println();
				break;
			}//switch
			
		}//while
    }//stuUpdate
    
    //4.학생성적 삭제
    void stuDelete() {
    	while(true) {
			System.out.println("[[ 학생성적 삭제 ]]");
			System.out.println("삭제할 학생이름을 입력하세요.(0.이전페이지 이동");
			String inputName = scan.next();
			if (inputName.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("입력된 이름으로 검색중........");
			int i = 0;     //검색되었을때 위치점을 저장하는 변수
			int count = 0; // 찾는 학생이 있는지 확인하는 변수
			for(i=0;i<list.size();i++) {
				StuScore st = list.get(i);
				if(inputName.equals(st.getName())) {
					System.out.println("입력된 이름으로 학생이 검색되었습니다.");
					count = 1;
					break; //for 나오기
				}//if
			}//for
			
			if(count==0) { //검색된 이름이 없으면 실행
				System.out.println("학생이 검색되지 않습니다. 다시 입력하세요");
				continue; 
			}// if 
			
			System.out.println("-------------------------");
			System.out.println("1. 학생성적 삭제");
			System.out.println("2. 학생성적삭제 취소");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("[[ 학생성적 삭제 ]]");
				System.out.println("-------------------------");
				System.out.println(inputName+" 학생성적이 삭제되었습니다.");
				list.remove(i); //학생성적 삭제
				System.out.println();
				break;
			case 2: 
				System.out.println("[[ 학생성적삭제 취소 ]]");
				System.out.println("-------------------------");
				System.out.println(inputName+"학생성적삭제가 취소되었습니다.");
				System.out.println();
				break;
			}//switch
		}//while
    }//stuDelete
    
    
    
    //8.파일 가져오기
    void stuFOpen() throws Exception {
    	FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] data = line.split(","); // 각 데이터값을 분리(,단위)
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
		System.out.println("저장된 파일을 가져왔습니다.");
		System.out.println();
    }//stuFOpen
    
    //9.파일 저장하기
    void stuFSave() throws Exception {
    	FileWriter fw = new FileWriter("c:/aaa/stu1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strData ="";
		for(int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
			strData += line+"\r\n"; //1명의 학생성적을 String 변환 후 strData추가해줌.
			//System.out.println(line);
		}
		bw.write(strData);
		bw.close();
		System.out.println("학생성적을 파일에 저장했습니다.");
		System.out.println();
    }//stuFSave
    
    //10. 등수처리
    void stuRank() {
    	System.out.println("[[ 학생성적 등수처리 ]]");
		list.size();
		for(int i=0;i<list.size();i++) {
			int count =1; //등수
			StuScore st1 = list.get(i);
			for(int j=0;j<list.size();j++) {
				StuScore st2 = list.get(j);
				if(st1.getTotal()<st2.getTotal()) count++;
			}//for j
			st1.setRank(count);
			System.out.println("학생"+(i+1)+"명의 등수 처리중...");
			
		}//for i
		System.out.println("학생성적 등수처리가 완료되었습니다.");
		System.out.println();
		
    }//stuRank
    
    //이름순 정렬
    void stuNameSort() {
    	Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {	
				return s1.getName().compareTo(s2.getName());
			}
		});
    }//stuNameSort
    
    
    //합계점수로 정렬
    //높은순
    void stuTotalHighSort() {
    	Collections.sort(list,new Comparator<StuScore>() {
    		@Override
			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal()-s1.getTotal();
			}
		});
    	System.out.println("성적이 높은순 정렬이 완료되었습니다.");
    }//stuTotalHighSort
	
    //낮은순
    void stuTotalLowSort() {
    	Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {				
				return s1.getTotal()-s2.getTotal();
			}
		});
    	System.out.println("성적이 낮은순 정렬이 완료되었습니다.");
    }//stuTotalLowSort
    
    

}
