package test;

import java.util.Scanner;

public class T00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		d.print();
		d.shuffle();
		System.out.println("--------------------------");
		d.print();
		System.out.println("--------------------------");
		d.pick();
		d.pick(51);
//		d.shuffle2();
		
		

	}//main

}//class
