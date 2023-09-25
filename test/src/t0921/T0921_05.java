package t0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class T0921_05 {

	public static void main(String[] args) throws Exception {
		//// 학번,이름,국어,영어,수학 점수를 입력받아 파일에 저장하시오
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();

		while (true) {

			System.out.println("학번을 입력하세요.(종료하려면 0번 입력)");
			int stuNum = scan.nextInt();
			if (stuNum == 0) {
				System.out.println(" [ 프로그램 종료 ] ");
				break;
			}
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
			
			list.add(new StuScore(stuNum,name,kor,eng,math));
			
			String data = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",
					stuNum,name,kor,eng,math,total,avg,rank);
			
			FileWriter fw = new FileWriter("c:/aaa/33.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			
			
		}

	}// main

}// class
