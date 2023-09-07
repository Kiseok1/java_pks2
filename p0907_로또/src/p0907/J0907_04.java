package p0907;

import java.util.Arrays;

public class J0907_04 {

	public static void main(String[] args) {
		System.out.println("args배열 : ");
		System.out.println(Arrays.toString(args));
		
		char n = '가';
		char n2 = '가';
		
		String a = "apple";
		String b = "apple";
		
		if (a==b) {
			System.out.println("참");
		} else
			System.out.println("거짓");

	}//main

}//class
