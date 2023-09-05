package p0901;

import java.util.Scanner;

public class JA0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력하세요."); //27 -> 2,7 분리를 해야 함.
	    String number = scan.next();
	    
	    //String 분리
	    char ch1 = number.charAt(0); // 27 -> 2의 주소값은 0, 7의 주소값은 1(앞에서부터 01234~순) (String만 가능)
	    char ch2 = number.charAt(1); // String에서 해당주소값을 char타입으로 가져옴
	    
	    //char타입을 int타입으로 변경
	    int n1 = ch1 - '0'; // '0': 48
	    int n2 = ch2 - '0';
	    int result = n1 + n2;
	    
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("두수 더하기 값 : "+result);
		
	}

}
