package p0907;

import java.util.Scanner;

public class J0907_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//학생 성적
		int[] stuNo= new int[10];
		String[] name = new String [10];
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0;
		String[] subject = {"국어","영어","수학"};
		String[] str = {"학번","이름","국어","영어","수학","총점","평균"};
		
		loop:while (true) {
			System.out.println("학생성적 프로그램");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종   료");
			System.out.println("-----------------");
			System.out.println("원하시는 메뉴를 선택하세요");
			int input = scan.nextInt();
			
			switch (input) {
			
			case 1:
				for (int i=count;i<10;i++) {
					System.out.println((i+1)+"번째 이름을 입력하세요.(중지:0)");
					name[i]= scan.next();
					if (name[i].equals("0")) {
						break;
					}//if
					stuNo[i]= i+1;
					for (int j=0;j<3;j++) {
						System.out.println(name[i]+"의 "+subject[j]+"점수를 입력하세요");
						score[i][j]=scan.nextInt();
					}//for 성적
					total[i]=score[i][0]+score[i][1]+score[i][2];
					avg[i]=total[i]/3.0;
					count++;
				}//for case1
				break;
			case 2:
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",str[0],str[1],str[2],str[3],str[4],str[5],str[6]);
				for (int i=0;i<count;i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",stuNo[i],name[i],score[i][0],score[i][1],score[i][2],total[i],avg[i]);
					
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
			
		}//while

	}//main

}//class
