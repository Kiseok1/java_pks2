package p0914;

public class T0914_04 {

	public static void main(String[] args) {
		TBuyer b1 = new TBuyer("aaa","홍길동");
		System.out.println(b1.money);
		
		b1.buy(new TComputer());
		b1.buy(new TComputer());
		b1.buy(new TComputer());
		
		b1.buy(new TAudio());
		b1.buy(new TWashing());
		b1.buy(new TTv());
		
		System.out.println("상품구매 저장크기 : "+b1.list.size());
		System.out.println("상품구매 목록 : ");
		
		
//		TProduct p =(TProduct)b1.list.get(0);
//		TProduct p =(TProduct)b1.list.get(1);
//		TProduct p =(TProduct)b1.list.get(2);
//		TProduct p =(TProduct)b1.list.get(3);
//		TProduct p =(TProduct)b1.list.get(4);
//		TProduct p =(TProduct)b1.list.get(5);
//		
		System.out.println(b1.list.get(0));
		
		
//		for (int i=0;i<b1.list.size();i++) {
//			TProduct p = (TProduct)b1.list.get(i);
//			System.out.println(p.name);
//		}
		
		
		

	}

}
