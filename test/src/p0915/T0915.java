package p0915;

import java.util.ArrayList;
import java.util.Scanner;

public class T0915 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();

		list.add(new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111"));

		String id = "";
		String pw = "";
		String name = "";

		loop: while (true) {

			System.out.println("[로그인 페이지]");
			System.out.println("아이디를 입력하세요");
			id = scan.next();
			System.out.println("패스워드를 입력하세요");
			pw = scan.next();

			for (int i = 0; i < list.size(); i++) {
				Member temp = (Member) list.get(i);
				if (id.equals(temp.getId()) && pw.equals(temp.getPw())) {
					System.out.println("로그인되었습니다.");
					name = temp.getName();
					break loop;
				} else {
					System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
					System.out.println();
				}

			}

		} // while

		Buyer b1 = new Buyer(id, name);
//		System.out.println(id +"   "+  name); //확인용

		int choice = 0;

		while (true) {
			System.out.println("구매 창");
			System.out.println("1. Tv");
			System.out.println("2. ....");
			System.out.println("3. ....");
			System.out.println("4. ....");
			System.out.println("5. 현재잔액");
			System.out.println("8. 총구매목록");
			System.out.println("9. 금액충전");
			System.out.println("원하시는 항목을 선택하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("TV구매를 선택하셨습니다. 결제를 진행할까요?(1.결제 2.취소)");
				int n = scan.nextInt();
				if (n == 1) {
					b1.buy(new Tv());
					System.out.println("결제되었습니다.");
					System.out.printf("%s 님의 현재 잔액 %,d\n", b1.id, b1.money);
					System.out.println();
				} else {
					System.out.println("결제가 취소되었습니다.");
					System.out.println();
				}

				break;
			case 5:
				System.out.printf("%s 님의 현재 잔액 : %,d\n", b1.id, b1.money);
				break;
			case 8:
				System.out.printf("%s 님의 구매목록 \n", b1.id);
				for (int i = 0; i <b1.list.size(); i++) {
					Product p = (Product)b1.list.get(i);
					if (i == 0) {
						System.out.printf("%s", p.name);
						continue;
					}
					System.out.printf(", %s", p.name);
						
					
					

				} // for
				System.out.println();
				break;
			}// swith

		} // while 구매창

	}// main

}// class
