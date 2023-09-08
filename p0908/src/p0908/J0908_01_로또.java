package p0908;

import java.util.Arrays;
import java.util.Scanner;

public class J0908_01_로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] myNo = new int[6];
		int[] eqNo = new int[6];
		int temp = 0;
		int count = 0;
		
		for (int i=0;i<45;i++) {
			ball[i]=i+1;
		}
		
		for (int i=0;i<500;i++) {
			int random = (int)(Math.random()*45);
			temp = ball[0];
			ball[0]=ball[random];
			ball[random]=temp;
		}
		
		for (int i=0;i<6;i++) {
			lotto[i]=ball[i];
		}
		Arrays.sort(lotto);
		
//		System.out.print("당첨 번호 : ");
//		for (int i=0;i<6;i++) {
//			System.out.printf("%2d  ",lotto[i]);
//		}
//		System.out.println();
		
		for (int i=0;i<6;i++) {
			System.out.println("번호 입력");
			myNo[i]=scan.nextInt();
		}
		Arrays.sort(myNo);
		
		
		System.out.println("-----------------------------------");
		System.out.print("★ 입력 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf("%2d  ",myNo[i]);
		}
		System.out.println();
		
		System.out.print("☆ 당첨 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf("%2d  ",lotto[i]);
		}
		System.out.println();
		
		//내가 한 방법
//		for (int i=0;i<6;i++) {
//			for (int j=0;j<6;j++) {
//				if (myNo[i]==lotto[j]) {
//					eqNo[j]=lotto[j];
//					count++;
//					break;
//				}
//			}
//		}
		
		//강사님 방법
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (myNo[i]==lotto[j]) {
					eqNo[count]=lotto[j];
					count++;
					break;
				}
			}
		}
		
		System.out.println("-----------------------------------");
		System.out.println("※ 당첨 개수 :  "+ count);
		
		//내가 한 방법
//		System.out.print("※ 적중 번호 : ");
//		for (int i=0;i<6;i++) {
//			if (eqNo[i]!=0) {
//				System.out.printf("%2d  ",eqNo[i]);
//			}
//		}
		
		//강사님 방법
		System.out.print("※ 적중 번호 : ");
		for (int i=0;i<count;i++) {
			System.out.printf("%2d  ",eqNo[i]);
		}
		
		System.out.println();
		System.out.println("-----------------------------------");


		

	}//main

}//class
