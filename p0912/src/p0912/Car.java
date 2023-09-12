package p0912;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white","auto",5); //다른생성자 호출시 this() / 항상 첫줄 
//		color = "white";        //this() 사용으로 불필요해짐
//		gearType = "auto";      //간혹 필요한 경우도 있음
//		door = 5;
	}
	
	Car (Car c){
		this(c.color,c.gearType,c.door); //this() : 다른 생성자 호출
	}

	Car(String color, String gearType, int door) {
		this.color = color;       //this.붙여 인스턴스변수 지정
		this.gearType = gearType; //this.가 없으면 지역변수 = 지역변수;
		this.door = door;         //인스턴스변수 = 지역변수;
	}

}
