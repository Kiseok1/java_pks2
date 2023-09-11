package p0911;

public class J0911_02 {

	public static void main(String[] args) {
		//배열을 선언 후 반복문
		
		String[] shape = {"Heart","Spade","Diamond","Clover"};
		
		J0911_card[] c = new J0911_card[4];
		for(int i=0;i<c.length;i++) {
			c[i] = new J0911_card();
			c[i].kind = shape[i];
			c[i].number=1;
			c[i].cardPrint();
		}
		
		System.out.println("------------------------------------");
			
		
		
		J0911_card c1 = new J0911_card(); // 객체선언 - 참조변수명.변수명
		c1.kind = "Heart"; //
		c1.number = 1;
		
		System.out.println(c1); //주소값 출력
		System.out.println();
		
		c1.cardPrint();
		
		J0911_card c2 = new J0911_card();
		c2.kind ="Spade";
		c2.number = 1;
		c2.cardPrint();
		//System.out.printf("kind : %s, number : %d \n",c2.kind,c2.number);
		
		J0911_card c3 = new J0911_card();
		c2.kind ="Diamond";
		c2.number = 1;
		c2.cardPrint();
		
		J0911_card c4 = new J0911_card();
		c2.kind ="Clover";
		c2.number = 1;
		c2.cardPrint();
		
		//int a; // 변수선언후 값을 지정하지 않고 사용을 하면 에러
		//System.out.println(a);
		
		//기본형 타입 선언후 사용방법
		//String kind = "Heart"; 
		//int numner = 1;
		

	}//main

}//class
