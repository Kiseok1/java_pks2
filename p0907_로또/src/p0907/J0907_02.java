package p0907;

import java.util.Scanner;

public class J0907_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// score [5][5] ->1-25까지 숫자를 입력해서 2차원 형태로 출력하시오.
		int[] temp = new int[25];
		int n = 0;
		int[][] score = new int[5][5];

		// 1차원 배열 temp 1-25까지 숫자를 입력하시오
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i + 1;
		}

		// 번호 섞기
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random() * 25); // 0-24
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;
		}

//		//temp배열 출력
//		for (int i = 0; i < 25; i++) {
//			System.out.print(temp[i] + " ");
//		}
//
//		System.out.println();

		// 2차원 배열에 temp배열을 입력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
//				score[i][j] = (5 * i) + (j + 1); // 1-25
				score[i][j] = temp[(5 * i) + j]; // 0-24
			}
		}

		// 숫자 맞추기 게임 무한반복
		while (true) {
			// ------>
			// 2차원 출력

			System.out.println("             [숫자 맞추기 게임]");
			System.out.printf(" |\t0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("--------------------------------------------");
			System.out.println("원하는 숫자를 입력하세요(1-25)");
			int number = scan.nextInt();

			// 모든 좌표값과 number값을 비교
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (number == score[i][j]) {
						score[i][j] = 0;
						break;
					}
				}
			}

//			//좌표를 넣어서 해당 값을 0으로 변경
//			System.out.println("좌표를 입력하세요(행)");
//			int input1 = scan.nextInt();
//			System.out.println("좌표를 입력하세요(열)");
//			int input2 = scan.nextInt();
//
//			// 좌표 위치값을 0으로 변경
//			score[input1][input2] = 0;

			// ----------->

		} // while

	}// main

}// class
