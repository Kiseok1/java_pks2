package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_10 {

	public static void main(String[] args) {
		//52장의 카드를 출력하시오
		ColAction2 ca2 = new ColAction2();
		ColAction ca = new ColAction();
		
		Card[] c = ca2.cardAll();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].getKind()+","+c[i].getNumber());
		}
		
		HashMap<String, Object> map = ca.scoreAll();
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");
		for (int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		ArrayList<Car> list2 = (ArrayList<Car>) map.get("list2");
		for(int i=0;i<list2.size();i++) {
			Car cc = list2.get(i);
			System.out.printf("%s,%d\n",cc.getColor(),cc.getDoor());
		}

	}//main

}//class
