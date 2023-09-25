package t0925;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int check =0;
		
		while(true) {
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("메뉴를 선택하세요");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				while(true) {
					int count = s.list.size()+1;
					System.out.println(count+"번째 이름 입력(0.이전페이지 이동");
					String name = scan.next();
					if(name.equals("0")) {
						break;
					}
					System.out.println("국어 점수 입력");
					int kor = scan.nextInt();
					System.out.println("영어 점수 입력");
					int eng = scan.nextInt();
					System.out.println("수학 점수 입력");
					int math = scan.nextInt();
					
					s.list.add(new StuScore(name,kor,eng,math));
					System.out.println("입력 완료");
					
					
				}
				break;
			case 2:
				for (int i=0;i<s.list.size();i++) {
					StuScore st = s.list.get(i);
					System.out.printf("%d %s %d %d %d %d %.2f %d\n",st.getStuNum(),st.getName(),st.getKor(),st.getEng(),st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
					
				}
				break;
				
			case 3: 
				int t=0;
				System.out.println("이름 입력");
				String name = scan.next();
				for (t=0;t<s.list.size();t++) {
					StuScore st = s.list.get(t);
					if (name.equals(st.getName())) {
						System.out.println("검색 성공");
						check=1;
						break;
					}
				}
				if (check==0) {
					System.out.println("검색 실패");
					continue;
				}
				StuScore st = s.list.get(t);
				System.out.println("1.국어");
				System.out.println("2.영어");
				System.out.println("3.수학");
				System.out.println("과목선택");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("수정할 점수 입력");
					int ud = scan.nextInt();
					st.setKor(ud);
					st.setTotal(st.getKor()+st.getEng()+st.getMath());
					st.setAvg(st.getTotal()/3.0);
					break;
				
				}//switch
				
			
			}//switch
			
		}//while

	}//main

}//class
