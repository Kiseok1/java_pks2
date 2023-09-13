package p0913;

public class Deck {
	Card[] c = new Card[52];
	String[] shape = { "Spade", "Diamond", "Clovr", "Heart" };

	Deck() {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(shape[(i / 13)], ((i % 13) + 1));
		}
	}

	void print() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("-----------------------");
	}

	void print(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
		System.out.println("------------------------");
	}

	void shuffle() {
		Card temp;
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;

		}
	}

	void shuffle(int n) {
		Card temp; // 객체선언(객체생성X) temp 주소값만 생성?
		for (int i = 0; i < n; i++) {
			int random = (int) (Math.random() * 52);
			// System.out.println(temp);
			temp = c[0]; // 주소값을 덮어쓰는 과정 (아래 과정을 통해 주소값을 맞바꿈?)
			c[0] = c[random];
			c[random] = temp;
			// System.out.println(temp)
		}
	}

	void pick() {
		int random = (int) (Math.random() * 52);
		System.out.println(c[random]);
		System.out.println("------------------------");
	}

	void pick(int n) {
		System.out.println(c[n]);
		System.out.println("------------------------");
	}

	// 특정번호 카드 가져오기
	Card pick2(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");
			return c[no % 52];
		}
		return c[no];
	}

	// 랜덤으로 카드 가져오기
	Card pick2() {
		int random = (int) (Math.random() * 52);
		return c[random];
	}

}
