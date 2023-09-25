package test;

import java.util.Scanner;

public class CarProduct {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int k =0;
		System.out.println("생산하려는 차량의 수");
		k = scan.nextInt();
		Car[] c = new Car[k];
		for (int i = 0 ;i<c.length;i++) {
			c[i] = new Car();
			System.out.println("기본타입");
			System.out.println("1.color : "+c[i].color);
			System.out.println("2.gearType : "+c[i].gearType);
			System.out.println("3.door : "+c[i].door);
			System.out.println("변경을 원하시면 번호를 선택하세요");
			System.out.println("0.기본타입 선택");
			System.out.println("---------------------------");
			int r = scan.nextInt();
			switch (r) {
			case 1:
				System.out.println("원하시는 color를 입력하세요");
				c[i].color = scan.next();
				break;
			case 2: 
				System.out.println("원하시는 gearType을 입력하세요");
				c[i].gearType = scan.next();
				break;
			case 3:
				System.out.println("원하시는 door의 수를 입력하세요");
				c[i].door = scan.nextInt();
				break;
			case 0:
				break;
			}//switch
		}//for
		
//		Car c1 = new Car();
//		c1.color = "black";
//		c1.gearType= "auto";
//		c1.door=4;
//		
//		Car c2 = new Car("blue","auto",5);
//		
//		System.out.println(c1.color);
//		System.out.println(c2.color);
		
		
	}//main
//class
}
