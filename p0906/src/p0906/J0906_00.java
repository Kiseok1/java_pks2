package p0906;

import java.util.Scanner;

public class J0906_00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-100 랜덤 숫자를 생성해서 맞추는 프로그램을 구현하시오 v
						
		//배열 100개를 생성하고, 1-100까지 숫자를 입력해서 출력하시오 arrNum v
				
		//배열 안의 배열
		
		//성적 입력 프로그램
		
		//로또
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int temp=0;
		
		for (int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		
		for (int i=0;i<500;i++) {
			int random = (int)(Math.random()*45)+1;
			temp = ball[i];
			ball[i] = ball[random];
			ball[random] = temp;
		}

	}//main

}//class
