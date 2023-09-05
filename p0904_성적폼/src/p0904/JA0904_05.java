package p0904;

import java.util.Scanner;

public class JA0904_05 {

	public static void main(String[] args) {
		//두 수를 입력받아 큰 수와 작은 수를 출력
		//ex) 10, 5 큰수: 10/ 작은수:5
		
		// 두 수를 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요.");
		int n1= scan.nextInt();
		System.out.println("두번재 수를 입력하세요.");
		int n2 = scan.nextInt();
		
		//두 수를 비교
		if (n1>n2) {
			System.out.printf("큰 수 : %,d \n",n1);
			System.out.printf("작은 수 : %,d \n",n2);
		} else if (n2>n1){
			System.out.printf("큰 수 : %,d \n",n2);
			System.out.printf("작은 수 : %,d \n",n1);
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		//두 수를 출력
		System.out.printf("1: %,d, 2: %,d \n",n1,n2);

	}

}
