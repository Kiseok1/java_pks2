package p0918;

public class J0918_02 {

	public static void main(String[] args) {
		Unit[] group = new Unit[5]; //부모클래스 객체선언
		group[0] = new Marine();    //다형성
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new DropShip();
		group[4] = new Tank();
		
		//Unit u = new Unit();    //에러!!
		//Unit u = new Marine();  //가능!!
		
//		Unit a;
//		a= new Unit();    //에러
//		a= new Marine();  //가능
		
//		Unit u1 = new Unit() {
//			void move(int x, int y) {
//				System.out.println("");
//			}
//		};               //객체 생성과 동시에 추상메서드 완성으로 가능 
		
		for(int i=0;i<group.length;i++) {
			group[i].move(100, 200);
		}

	}

}
