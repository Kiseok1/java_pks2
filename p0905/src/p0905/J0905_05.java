package p0905;

public class J0905_05 {

	public static void main(String[] args) {
		//구구단 가로
		for (int i=2;i<=9;i++) {
			System.out.printf("[  %d  단  ]\t",i);
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %2d \t",j,i,(i*j));
			}
			System.out.println();
		}
		
		//구구단 출력
//		for (int i=2;i<=9;i++) {
//			System.out.printf("[  %d  단  ]\n",i);
//			for (int j=1;j<=9;j++) {
//				System.out.printf(" %d * %d = %2d \t", i,j,(i*j));
//			}
//			System.out.println();
//			//System.out.println("-----------");
//		}

	}//main

}//class
