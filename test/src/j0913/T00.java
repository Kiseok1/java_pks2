package j0913;

public class T00 {

	public static void main(String[] args) {
		// 카드 52장 생성해서 숫자와 모양을 입력하고, 카드를 섞은 후 처음부터 5장을 출력하시오
		// Card,Deck,main
		// 포함관계(객체선언)로 구성해서 프로그램을 구현하시오.
		// a 5장 / b 5장 배분 후 출력

		// private - 접근제어자활용 캡슐화
		// getter setter 만들기(StuScore)

		// singleton 패턴

		// 다형성

		Tv t1 = new Tv();
		System.out.println(t1.price);
		Product p = new Product();
		System.out.println(p.price);
		Product t2 = new Tv();
		System.out.println(t2.price);
	

	}

}
