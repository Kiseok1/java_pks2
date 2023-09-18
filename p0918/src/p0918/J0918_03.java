package p0918;

public class J0918_03 {

	public static void main(String[] args) {
		Tank t = new Tank();
		System.out.println("탱크가 폭탄 맞음");
		t.hitPoint -= 10; 
		System.out.println("탱크가 폭탄 맞음");
		t.hitPoint -= 10;
		System.out.println("탱크가 총알 맞음");
		t.hitPoint -= 2;
		System.out.println("탱크의 체력 : "+t.hitPoint);
		
		Scv s = new Scv();
		Marine m = new Marine();
		
		s.repair(t);
		System.out.println("탱크의 체력 : "+t.hitPoint);

		DropShip d =new DropShip();
		System.out.println("DropShip 총알 맞음");
		d.hitPoint -= 20;
		System.out.println("DropShip 체력 : "+d.hitPoint);
		s.repair(d); //수송선 수리
		
		System.out.println("Marine 총알 맞음");
		m.hitPoint -= 30;
		System.out.println("Marine 체력 : "+m.hitPoint);
		//s.repair(m);
		System.out.println("Marine 체력 : "+m.hitPoint);
		
//		Repairable m1 = new Marine();  //에러(Repairable implements 안함)
//		Repairable t1 = new Tank();    //가능
//		Unit u2 = (Unit)t1;
		
//		Unit u1 = new Repairable();    //에러
//		Tank t2 = new Repairable();    //에러
		
		

		
		
	}//main
	
}//class
