package p0915;

import java.util.ArrayList;
import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {
		// tv

		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();

		Member m1 = new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111");
		list.add(m1);

		String id = "";
		String pw = "";
		String name = "";

//		System.out.println("로그인 페이지");
//		System.out.println("아이디를 입력하세요");
//		id = scan.next();
//		System.out.println("패스워드를 입력하세요");
//		pw = scan.next();
//		Member temp;
//		for (int i;i<list.size();i++) {
//			
//		}

		Buyer b1 = new Buyer("aaa", "홍길동");
		int choice = 0;

		while (true) {
			System.out.println("[상품 구매 페이지]");
			System.out.println("1. TV");
			System.out.println("2. ...");
			System.out.println("3. ...");
			System.out.println("4. ...");
			System.out.println("5. ...");
			System.out.println("-----------------");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("TV구매를 선택하셨습니다. 결제를 진행할까요?(1.진행 2.취소)");
				int c = scan.nextInt();
				if (c == 1) {
					int check = b1.buy(new Tv());
					if (check==0) break;
					System.out.println("결제가 완료되었습니다.");
					System.out.printf("%s님의 현재 잔액 : %,d 원 \n", b1.name, b1.money);
					System.out.println();
					
				} else {
					System.out.println("결제가 취소되었습니다.");
					
				}
				break;
			}
		}

	}// main

}// class
