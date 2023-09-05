package p0904;

import java.util.Scanner;

public class JA0904_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, F
		// 98점이상 A+, 93이하 A-

		String grade = "";

		System.out.println("점수 입력");
		int score = scan.nextInt();
		if (score >= 90) {
			// System.out.print("A");
			grade = "A";
			if (score >= 98) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 93) {
				// System.out.println("-");
				grade = grade + "-";
			} else {
				// System.out.println();
			}
		} else if (score >= 80) {
			// System.out.print("B");
			grade = "B";
			if (score >= 88) {
				// System.out.println("+");
				grade += "+";
			} else if (score <= 83) {
				// System.out.println("-");
				grade += "-";
			} else {
				// System.out.println();
			}
		} else if (score >= 70) {
			// System.out.print("C");
			grade = "C";
			if (score >= 78) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 73) {
				// System.out.println("-");
				grade = grade + "-";
			} else {
				// System.out.println();
			}
		} else if (score >= 60) {
			// System.out.print("D");
			grade = "D";
			if (score >= 68) {
				// System.out.println("+");
				grade += "+";
			} else if (score <= 63) {
				// System.out.println("-");
				grade += "-";
			} else {
				// System.out.println();
			}
		} else {
			// System.out.print("F");
			// System.out.println();
			grade = "F";
		}

		System.out.println("학점 : " + grade);
		System.out.println("점수 : " + score);

	}

}
