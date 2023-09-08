package p0908;

public class J0908_03 {

	public static void main(String[] args) {
		int[] num = new int[3]; //num : 참조변수(기본8타입제외 ([]로 인해))
		
		int a = 0; //a : 참조변수 X 
		
		//배열선언 - 저장할 공간이 생김.
		int[] hour = new int[3];
		int[] min = new int[3];
		double[] sec = new double[3];
		//배열데이터 입력
		hour[0] = 12;
		min[0] = 12;
		sec[0] = 12.25;
		
		//객체선언 - 저장할 공간이 생김
		Time t = new Time();
		t.hour =12;
		t.minute=12;
		t.second=12.25;
		
		Time t2 = new Time();
		Time t3 = new Time();
		
		System.out.println(hour); //주소
		System.out.println(hour[0]); //데이터
		System.out.println(t); // 주소
		System.out.println(t.hour); //데이터
		
		//변수에 데이터 넣기
		int i=10;
		//배열선언후 데이터 넣기
		int[] arr = new int[3];
		arr[0]=10;
		//객체선언후 데이터 넣기
		Time time = new Time();
		time.hour = 10;
		

	}//main

}//class
