package t0922;

import java.util.ArrayList;
import java.util.HashMap;


public class T0922_02 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap();
		TAction t =new TAction();
		
		String[] color = {"white","red","blue"};
		int[] door = {5,4,5};
		
		String[] name = {"홍길동","유관순","이순신"};
		int[] kor = {100,90,80};
		int[] eng = {90,80,70};
		int[] math = {80,70,60};
		
		map = t.cal(color,door,name,kor,eng,math);
	
		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		
		for (int i=0;i<list.size();i++) {
			Car c = list.get(i);
			System.out.println(c.getColor()+","+c.getDoor());
		}
		
		

	}//main

}//class
