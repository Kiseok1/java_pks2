package p0905;

public class J0905_07 {

	public static void main(String[] args) {
		// 1-100까지 순번과 합을 출력하시오
		// for문
		// while문

		// for
//		int sum=0;
//		for (int i=1;i<=100;i++) {
//		sum = sum +=i;
//		System.out.printf("순번 : %3d, 합 : %4d \n",i,sum);
//		}

		// while
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum += i;
			System.out.printf("순번 : %3d, 합 : %4d \n", i, sum);
			i++;
		}

	}

}
