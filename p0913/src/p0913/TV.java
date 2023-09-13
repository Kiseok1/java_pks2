package p0913;

public class TV extends Product {

	int size;

	TV(){
		this("삼성TV",1000000,10000,70);
	}

	TV(String pName, int price, int bonusPoint,int size){
		this.pName = pName;
		this.price = price;
		this.bonusPoint =bonusPoint;
		this.size = size;
	}

}
