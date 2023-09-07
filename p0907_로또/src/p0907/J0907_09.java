package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//로또
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] myNum = new int[6];
		int temp = 0;
		int count = 0;
		
		for (int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		
		for (int i=0;i<500;i++) {
			int random = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[random];
			ball[random]= temp;
		}
		
		for (int i=0;i<6;i++) {
			lotto[i]=ball[i];
		}
		Arrays.sort(lotto);
		
		//당첨번호 확인
//		for (int i=0;i<6;i++) {
//			System.out.print(lotto[i]+" ");
//		}
//		
//		System.out.println();
		for (int i=0;i<6;i++ ) {
			System.out.println("번호 입력");
			myNum[i]=scan.nextInt();		
		}
		Arrays.sort(myNum);
		
		System.out.print("당첨 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf("%2d ",lotto[i]);
		}
		
		System.out.println();
		System.out.print("입력 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf("%2d ",myNum[i]);
		}
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (myNum[i]==lotto[j]) {
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.print("당첨 개수 : "+count);
		

	}//main

}//class
