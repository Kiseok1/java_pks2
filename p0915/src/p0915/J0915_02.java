package p0915;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		String[] title = { "번호", "이름", "국어", "영어", "수학", "총점", "평균", "등수" };
		int stuCount = 1;

		// 무한반복
		loop:while (true) {

			// 메인화면 출력부분 방법1
			int choice = stuAction.mainPrint();

			// 메인화면 출력부분 방법2
//			stuAction.mainPrint();
//			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				// 1. 학생입력메소드
//				while (true) {
//
//					System.out.println();
//					System.out.println("[ 학생입력 ]");
//					System.out.printf("%d번째 학생 이름을 입력하세요.(0.이전페이지 이동) \n", stuCount);
//					String name = scan.next();
//					if (name.equals("0")) { //이전페이지 이동
//						System.out.println(">> 이전 페이지로 이동합니다.");
//						System.out.println();
//						break;
//					}
//					System.out.println("국어점수를 입력하세요");
//					int kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요");
//					int eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요");
//					int math = scan.nextInt();
//					// 학생성적 저장
//					stuAction.list.add(new StuScore(name, kor, eng, math));
//
//					System.out.printf("%d번째 학생성적이 저장되었습니다.\n", stuCount);
//					System.out.println();
//					stuCount++;
//				}//while 성적입력

				stuCount = stuAction.stuInput(stuCount);
				break;

			case 2: // 학생성적출력

//				System.out.println();
//				System.out.println("[ 학생성적 출력] ");
//				System.out.println("--------------------------------------------------------------");
//				for (int i=0;i<title.length;i++) {
//					System.out.printf("%s\t",title[i]);
//				}
//				System.out.println();
//				System.out.println("--------------------------------------------------------------");
//				for (int i=0;i<stuAction.list.size();i++) {
//					StuScore s = stuAction.list.get(i); //지너릭스 이용 (형변환생략)
//					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//				}//for
//				System.out.println("--------------------------------------------------------------");
//				System.out.println();

				stuAction.stuOutput();
				break;

			case 3: // 학생성적수정 메소드
//				while (true) {
//					System.out.println();
//					System.out.println("[ 학생성적 출력] ");
//					System.out.printf("찾고자 하는 학생 이름을 입력하세요.(0.이전페이지 이동) \n", stuCount);
//					String name = scan.next();
//					if (name.equals("0")) { // 이전페이지 이동
//						System.out.println(">> 이전 페이지로 이동합니다.");
//						System.out.println();
//						break;
//					}
//
//					// 홍길동
//					int count = -1; // 0,1,2....
//					for (int i = 0; i < stuAction.list.size(); i++) {
//
//						StuScore s = stuAction.list.get(i);
//						if (name.equals(s.getName())) {
//							count = i; // 찾은 방 번호
//							System.out.printf("%s 학생을 찾아습니다.\n", name);
//							System.out.println(" [ 수정과목 선택 ]");
//							System.out.println("1. 국어");
//							System.out.println("2. 영어");
//							System.out.println("3. 수학");
//							System.out.println("-------------------");
//							System.out.println("원하는 번호를 선택하세요.");
//							choice = scan.nextInt();
//
//							switch (choice) {
//							case 1:
//								System.out.println(" [ 국어점수 수정 ] ");
//								System.out.println("---------------------");
//								System.out.println("현재 점수 : " + s.getKor());
//								System.out.println("변경할 점수를 입력하세요");
//								s.setKor(scan.nextInt()); // 입력 후 바로 국어점수에 저장
//								s.setTotal(s.getKor() + s.getEng() + s.getMath()); // 점수를 읽은 후 바로 합계 수정
//								s.setAvg(s.getTotal() / 3.0); // 평균 수정
//								System.out.println("국어점수가 변경되었습니다.");
//								System.out.println();
//
//								break;
//
//							case 2:
//								System.out.println(" [ 영어점수 수정 ] ");
//								System.out.println("---------------------");
//								System.out.println("현재 점수 : " + s.getEng());
//								System.out.println("변경할 점수를 입력하세요");
//								s.setEng(scan.nextInt()); // 입력 후 바로 영어점수에 저장
//								s.setTotal(s.getKor() + s.getEng() + s.getMath()); // 점수를 읽은 후 바로 합계 수정
//								s.setAvg(s.getTotal() / 3.0); // 평균 수정
//								System.out.println("영어점수가 변경되었습니다.");
//								System.out.println();
//
//								break;
//
//							case 3:
//								System.out.println(" [ 수학점수 수정 ] ");
//								System.out.println("---------------------");
//								System.out.println("현재 점수 : " + s.getMath());
//								System.out.println("변경할 점수를 입력하세요");
//								s.setMath(scan.nextInt()); // 입력 후 바로 수학점수에 저장
//								s.setTotal(s.getKor() + s.getEng() + s.getMath()); // 점수를 읽은 후 바로 합계 수정
//								s.setAvg(s.getTotal() / 3.0); // 평균 수정
//								System.out.println("수학점수가 변경되었습니다.");
//								System.out.println();
//
//								break;
//							}// switch
//						} // if
//
//					} // for
//					if (count == -1) {
//						System.out.printf("※ 찾고자 하는 %s 학생이 없습니다. 다시 입력하세요.\n",name);
//						System.out.println();
//					}
//
//				} // while

				stuAction.stuUpdate();
				break;

			case 4:
				// 4. 학생성적삭제 메소드
//				while(true) {
//					
//					System.out.println();
//					System.out.println("[ 학생성적 삭제] ");
//					System.out.printf("삭제 하고자 하는 학생 이름을 입력하세요.(0.이전페이지 이동) \n");
//					String name = scan.next();
//					if (name.equals("0")) { // 이전페이지 이동
//						System.out.println(">> 이전 페이지로 이동합니다.");
//						System.out.println();
//						break;
//					}// if
//					int count = -1; // 0,1,2....
//					for (int i = 0; i < stuAction.list.size(); i++) {
//						
//						StuScore s = stuAction.list.get(i);
//						if (name.equals(s.getName())) {
//							count = i; // 찾은 방 번호
//							System.out.printf("%s 학생을 찾았습니다.\n", name);
//							System.out.println(" [ 학생성적삭제 선택 ]");
//							System.out.println("1. 예");
//							System.out.println("2. 아니오");
//							System.out.println("-------------------");
//							System.out.println("원하는 번호를 선택하세요.");
//							choice = scan.nextInt();
//							
//							switch (choice) {
//							case 1:
//								stuAction.list.remove(i);
//								System.out.printf("%s 학생성적이 삭제되었습니다. \n", name);
//								System.out.println();
//								break;
//							case 2:
//								System.out.printf("%s 학생성적이 삭제 취소되었습니다. \n",name);
//								System.out.println();
//								break;
//								
//							}// switch
//						} // if
//						
//					} // for
//					if (count == -1) {
//						System.out.printf("※ 찾고자 하는 %s 학생이 없습니다. 다시 입력하세요.\n",name);
//						System.out.println();
//					}//if
//					
//				}//while

				stuAction.stuDelete();
				break;

			case 5:
				// 학생성적검색 메소드
//				while (true) {
//
//					System.out.println();
//					System.out.println("[ 학생성적 검색] ");
//					System.out.printf("찾고자 하는 학생 이름을 입력하세요.(0.이전페이지 이동) \n");
//					String name = scan.next();
//					if (name.equals("0")) { // 이전페이지 이동
//						System.out.println(">> 이전 페이지로 이동합니다.");
//						System.out.println();
//						break;
//					} // if
//
//					int count = -1; // 0,1,2....
//					for (int i = 0; i < stuAction.list.size(); i++) {
//
//						StuScore s = stuAction.list.get(i);
//						if (name.equals(s.getName())) {
//							count = i; // 찾은 방 번호
//							System.out.printf("%s 학생을 찾았습니다.\n", name);
//
//							System.out.println();
//							System.out.printf("[ %s 학생성적 출력] \n", name);
//							System.out.println("--------------------------------------------------------------");
//							for (int j = 0; j < title.length; j++) {
//								System.out.printf("%s\t", title[j]);
//							}
//							System.out.println();
//							System.out.println("--------------------------------------------------------------");
//							System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getStuNo(), s.getName(),
//									s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
//
//							System.out.println("--------------------------------------------------------------");
//							System.out.println();
//							break; // for break;
//
//						} // if
//
//					} // for
//					if (count == -1) {
//						System.out.printf("※ 찾고자 하는 %s 학생이 없습니다. 다시 입력하세요.\n", name);
//						System.out.println();
//					} // if
//				}
				
				stuAction.stuSearch();
				break; // switch break;
				
			case 6:
				//등수처리
				System.out.println();
				System.out.println(" [ 학생성적 등수처리 ] ");
				System.out.printf("등수처리를 진행할까요?(0.이전페이지 이동) \n");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.println("0. 이전페이지 이동");
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					for (int i=0;i<stuAction.list.size();i++) {
						int count = 1;
						StuScore s = stuAction.list.get(i);
						for (int j=0;j<stuAction.list.size();j++) {
							StuScore s2 = stuAction.list.get(j);
							if (s.getTotal()<s2.getTotal()) {
								count++;
							}//if 
						}
						s.setRank(count);
					}//for i
					
					System.out.println("등수처리가 완료되었습니다.");
					
					break;
				case 2:
					System.out.println("등수처리가 취소되었습니다.");
					System.out.println();
					break;
				case 0:
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break;
					
				}// switch
				
				
				break; //case 6 break
			case 0:
				System.out.println();
				System.out.println("[ 프로그램 종료] ");
				System.out.printf("프로그램을 종료합니다.");
				break loop;

			}// switch 각메뉴
		} // while main출력
	}// main
}// class
