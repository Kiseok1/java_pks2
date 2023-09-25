package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class T0914_05 {

	public static void main(String[] args) {
		// ---1--- 01
		// 소스이용 생성자 자동생성
		// 소스이용 getter setter 생성

		// ---2--- 02.03
		// 싱글톤 - Calendar
		// Car, Ambulance, FireEngine 다형성,instanceof

		// ---3--- 04
		// Buyer

		// ---4--- 04
		// ArrayList활용
		// (0914_04) 상품구매목록 for문에서 형변환 필요이유?
		// (0914_04) 상품구매목록 for문에서 Product p 중복아닌가? //덮어쓰기인듯...

		// ---5--- 04.05.06
		// ArrayList활용
		// (0914_04) toString 이용하여 출력(Product class)
		// Member, MemberAll

		// ---6--- 06.07.08.09
		// 배열 5개 - "aaa","1111" "bbb","2222" c-3333,d-4444,e-5555
		// 배열 5개 입력후 출력 (Mem)
		// ArrayList 5개 입력후 출력

		// ---7--- 10.11

		// ---8--- 11
		// 쇼핑몰 작성

		ArrayList list = new ArrayList();
		Scanner scan = new Scanner(System.in);

		list.add(new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111"));
		list.add(new Member("bbb", "2222", "유관순", "부산", "010-2222-2222"));
		list.add(new Member("ccc", "3333", "이순신", "대구", "010-3333-3333"));
		list.add(new Member("ddd", "4444", "강감찬", "인천", "010-4444-4444"));
		list.add(new Member("eee", "5555", "김 구", "광주", "010-5555-5555"));

		System.out.println("[하이마켓 쇼핑몰 로그인]");
		String id = "";
		String pw = "";
		String name = "";

		loop:while (true) {
			System.out.println("아이디를 입력하세요");
			id = scan.next();
			System.out.println("패스워드를 입력하세요");
			pw = scan.next();

			int check = 0;
			for (int i = 0; i < list.size(); i++) {
				Member temp = (Member) list.get(i);
				if (id.equals(temp.getId()) && pw.equals(temp.getPw())) {
					System.out.println("로그인 되셨습니다.");
					name = temp.getName();
					System.out.println();
					check = 1;
					break loop;
				}
			}
			if (check == 0) {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
				System.out.println();
			}
		} // while
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		
		while (true) {
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("9. 총구매목록");
			System.out.println("0. 프로그램종료");
			System.out.println("--------------------");
			System.out.println("구매를 원하시는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				int n=0;
				System.out.println("TV구매를 선택하셨습니다.(1.구매, 2.취소)");
				n=scan.nextInt();
				if(n==1) {
					b1.buy(new Tv());
					System.out.println("TV를 구매하셨습니다.");
					System.out.printf("잔액 : %,d\n",b1.money);
					System.out.println();
					
				}
				if(n==2) {
					System.out.println("구매를 취소하셨습니다.");
					
				}
				break;
			case 5: 
				System.out.printf("%s님의 잔액 : %,d\n",b1.id,b1.money);
				System.out.println();
				break;
			}
		}

	}

}
