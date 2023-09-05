package p0831;

public class JA0831_03 {

	public static void main(String[] args) {
		boolean power = true;
		boolean power2 = false;
		
		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041'; // \u0041은 A (u는 16진수를 0041이 16진수로 A를 의미)
		char tab = '\t'; // \t는 탭키
		byte b = 127;
		short s = 32767;
		
		int num=97;
		int num2=0100; // 8진수
		
		System.out.print(ch); //print 출력 / println 출력+줄바꿈
		System.out.print(ch3);
		System.out.print(ch2);
		System.out.print(tab);
		System.out.print(b);
		System.out.println(s);
		System.out.println("-----------------");
		System.out.println(num);
		System.out.println((char)num); //숫자를 문자로 변경(아스키코드표 참조)
		System.out.println(num2);
		
		int number=0;
		System.out.println(number); // 지역변수는 값을 입력해야 사용할 수 있음.

	}

}
