package p0908;

import java.util.Arrays;
import java.util.Scanner;

public class J0908_00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//로또
		
		// Spade-13장, Heart-13장, Diamond-13장, Clover-13장
		// 52장
		
		Card[] c = new Card[52];
		String[] shape = {"Spade","Diamond","Clover","Heart"};
		for (int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].number = (i%13)+1;
			c[i].kind = shape[i/13];
		}
		System.out.println("Card number : ");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%2d,%s \n", c[i].number,c[i].kind);
		}
		
		
		}// main

}// class
