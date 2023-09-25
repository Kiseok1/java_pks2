package t0921;

import java.util.Scanner;

public class T0921_02 {

	public static void main(String[] args) {
		// 학번,이름,국어,영어,수학 점수를 입력받아 파일에 저장하시오
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		int stuNum = scan.nextInt();
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		int rank = 0;
		
		String data = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", stuNum,name,kor,eng,math,total,avg,rank);
		
		System.out.println(data);
		
		String[] arrData = data.split(",");
		
	}

}
