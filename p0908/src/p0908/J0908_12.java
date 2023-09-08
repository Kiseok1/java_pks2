package p0908;

public class J0908_12 {

	public static void main(String[] args) {
		//J0908_11 total메소드를 호출해서 사용함.
		//클래스명.메소드명 - static
		System.out.println(J0908_11.total(10, 10, 9));
		
//		//static 뺄 경우 사용법
//		J0908_11 j = new J0908_11(); 객체선언! 후 사용
//		System.out.println(j.avg(10, 10, 9));
		
	    System.out.println(J0908_11.avg(10, 10, 9));

	}

}
