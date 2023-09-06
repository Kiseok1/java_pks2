package p0906;

public class J0906_02 {

	public static void main(String[] args) {
		//배열 100개를 생성하고, 1-100까지 숫자를 입력해서 출력하시오 arrNum
		int i = 0;
		int[] arrNum =new int[100];
		
		for (i=0;i<arrNum.length;i++) {
			arrNum[i]=i+1;
		}
		
		System.out.print("입력된 수 : ");
		for (i=0;i<arrNum.length;i++) {
			if (i==0) {
				System.out.print(arrNum[i]);
				continue;
			}
			System.out.print(","+arrNum[i]);
		}//for
		System.out.println();
	
	}//main

}//class
