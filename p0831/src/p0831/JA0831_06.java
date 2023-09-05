package p0831;

public class JA0831_06 {

	public static void main(String[] args) {
		int x= 2147483647;
		int total = 0;
		total = x + 5;
		
		System.out.println(total); //overflow 최대값의 범위를 넘어서면 최소값으로 넘어감 최소값의 범위를 넘어서는 것도 마찬가지
		
		int a = 1000000;
		int b = 1000000;
		System.out.println(a+b);
		System.out.println(a*b);
		

	}

}
