package j0918;

public class Tank extends GroundUnit {

	Tank() {
		super(150);
		hitPoint = MAX_HP;
		name = "Tank";
		
	}



	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동! \n",name,x,y);	
	}
	

}
