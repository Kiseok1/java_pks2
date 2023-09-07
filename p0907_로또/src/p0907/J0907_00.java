package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// score [5][5] ->1-25까지 숫자를 입력해서 2차원 형태로 출력하시오. v
		// 배열섞기 v
		// 좌표입력 후 그 좌표 0으로 변경 v
		// 수 입력으로 0으로 변경 v

//		int[] temp = new int[25];
//		int n = 0;
//
//		int[][] score = new int[5][5];
//		for (int i = 0; i < temp.length; i++) {
//			temp[i] = i + 1;
//		}
//
//		for (int i = 0; i < 500; i++) {
//			int random = (int) (Math.random() * 25);
//			n = temp[0];
//			temp[0] = temp[random];
//			temp[random] = n;
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				// score[i][j]=(5*i)+j+1;
//				score[i][j] = temp[(5 * i) + j];
//			}
//		}
//
//		while (true) {
//			System.out.printf(" |\t0\t1\t2\t3\t4\n");
//			System.out.println("----------------------------------------------------------");
//			for (int i = 0; i < 5; i++) {
//				System.out.print(i + "|\t");
//				for (int j = 0; j < 5; j++) {
//					System.out.print(score[i][j] + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println("----------------------------------------------------------");
//
////			System.out.println("행 입력");
////			int input1 = scan.nextInt();
////			System.out.println("열 입력");
////			int input2 = scan.nextInt();
////
////			score[input1][input2] = 0;
//			
//			System.out.println("수 입력");
//			int number = scan.nextInt();
//			for (int i=0;i<5;i++) {
//				for (int j=0;j<5;j++) {
//					if (number==score[i][j]) {
//						score[i][j] = 0;
//						break;
//					}
//				}
//			}
//
//		}
		
		//주택복권
//		int fNo= (int)(Math.random()*9)+1;
//		int sNo= (int)(Math.random()*100000);
//		String strNo=String.format("%05d",sNo);
//		int count = 0;
//		
//		String winNo= fNo+"조"+strNo;
//		System.out.println(winNo);
//		System.out.println("조를 선택하세요");
//		int input1 = scan.nextInt();
//		System.out.println("5자리 수를 선택하세요");
//		String input2= scan.next();
//		String myNum = input1+"조"+input2;
//		
//		System.out.println("입력번호 : "+myNum);
//		
//		if (myNum.charAt(6)==winNo.charAt(6)) {
//			count++;
//			if (myNum.charAt(5)==winNo.charAt(5)) {
//				count++;
//				if (myNum.charAt(4)==winNo.charAt(4)) {
//					count++;
//					if (myNum.charAt(3)==winNo.charAt(3)) {
//						count++;
//						if (myNum.charAt(2)==winNo.charAt(2)) {
//							count++;
//							if (myNum.charAt(0)==winNo.charAt(0)) {
//								count++;	
//							}
//						}
//					}
//				}
//			}
//		}
//			
//		
//		System.out.print("당첨번호 : ");
//	    System.out.println(winNo);
//	    
//	    if (count==0) {
//	    	System.out.println("꽝");
//	    }
//	    if (count==1) {
//	    	System.out.println("천원");
//	    }
//	    if (count==2) {
//	    	System.out.println("만원");
//	    }
//	    if (count==3) {
//	    	System.out.println("십만원");
//	    }
//	    if (count==4) {
//	    	System.out.println("백만원");
//	    }
//	    if (count==5) {
//	    	System.out.println("천만원");
//	    }
//	    if (count==6) {
//	    	System.out.println("1억");
//	    }
	    
	    //로또 번호 
		int[] ball= new int[45];
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
			ball[0]=ball[random];
			ball[random]=temp;
			
		}
		
		for (int i=0;i<6;i++) {
			lotto[i]=ball[i];
		}
		Arrays.sort(lotto);
		
		//당첨번호 확인
//		for (int i=0;i<6;i++) {
//			System.out.println(lotto[i]);	
//		}
		
		for (int i=0;i<myNum.length;i++) {
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
		System.out.println();
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (myNum[i]==lotto[j]) {
					count++;
				}
			}
		}
		
		System.out.println("맞은 개수 : "+count);
		
		
		

	}// main

}// class
