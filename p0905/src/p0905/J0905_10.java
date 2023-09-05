package p0905;

public class J0905_10 {

	public static void main(String[] args) {
		//구구단 for문 구현
		//2-9단 출력
		for (int i=2;i<=9;i++) {
//			if(i%2==1) {
//				continue;
//			}
			for (int j=1;j<=9;j++) {
				if (j%2==0) {
					continue;
				}
				System.out.printf("%d * %d = %2d \n",i,j,(i*j));
			} System.out.println("-----------");
		}
		
		//가로(2단 3단 4단...)
//		for (int k=2;k<=9;k++) {
//			System.out.printf("[  %d  단  ]\t",k);
//		}
//		System.out.println();
//		for (int i=1;i<=9;i++) {
//			for (int j=2;j<=9;j++) {
//				System.out.printf("%d * %d = %2d \t",j,i,(i*j));
//			} System.out.println();
//		}
		
//		for (int i=1;i<=10;i++) {
//			if (i%3==0) {
//				//break ; //반복문을 완전히 멈춤
//				continue; //한번만 멈춤
//			}//if
//			System.out.println(i);
//		}//for

	}//main

}//class
