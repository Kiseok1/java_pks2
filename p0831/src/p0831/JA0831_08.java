package p0831;

public class JA0831_08 {

	public static void main(String[] args) {
		int age = 20;
		String address = "서울특별시 구로구 구로동";
		//당신의 나이는 20세, 사는 곳은 서울특별시 구로구 구로동 입니다.
		System.out.println("당신의 나이는 "+age+"세, 사는 곳은 "+address+"입니다.");
		System.out.println("----------------------------------------------");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s입니다. \n",age,address);
		
		// 국어,영어,수학 평균을 출력 소수점 2자리까지 출력하시오.
		//100,100,99
		
		int kor=100;
		int eng=100;
		int math=99;
		double avg=(kor+eng+math)/3.0; // int / double -> double 표기 (3.0을 3으로 표기시 int /int -> int 표기 이므로 99.00으로 출력됨)
		
		double total=kor+eng+math;
		double avg2=total/3; // double / int -> double 표기
		
		int total3=kor+eng+math;
		double avg3=total3/3.0; // int / double -> double 표기 (3.0을 3으로 표기시 int /int -> int 표기 이므로 99.00으로 출력됨)
		
		// 연산과정에서 소수점 자리 표기 위해서는 적어도 하나는 소수점 표기가 가능한 double,float 사용 해야함(혹은 수에 소수점 입력)
		
		System.out.printf("평균 : %.2f \n" , avg);
		System.out.printf("평균 : %.2f \n", avg2);
		System.out.printf("평균 : %.2f \n", avg3);
		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		
		System.out.println();
		
		System.out.printf("%05.2f", 5.8);
			

	}

}
