package p0911;

public class J0911_09 {

	public static void main(String[] args) {
		Data d = new Data();
		Data c = new Data();
		d.x = 10;
		c.x = 10;
		System.out.println("d.x : " + d.x);
		System.out.println(d); // 주소값 출력
//		change1(d.x);
//		System.out.println("d.x : "+d.x);
		change(d);
		System.out.println("2번째 d.x : " + d.x);

	}// main

	static void change(Data a) {
		a.x = 1000;
		System.out.println("change x : " + a.x);
	}

	static void change1(int x) {
		x = 1000;
		System.out.println("change1 x : " + x);
	}

}// class
