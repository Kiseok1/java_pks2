package t0921;

import java.util.ArrayList;
import java.util.HashMap;



public class ColAction {
	HashMap<String, Object> map = new HashMap();
	ArrayList<StuScore> list = new ArrayList();
	ArrayList<Car> list2 = new ArrayList();
	
	HashMap<String, Object> scoreAll() {
		list.add(new StuScore("홍길동",100,100,99));
		list.add(new StuScore("유관순",80,80,89));
		list.add(new StuScore("이순신",90,90,91));
		
		
		list2.add(new Car("white",5));
		list2.add(new Car("red",4));
		list2.add(new Car("black",5));
		
		map.put("list", list);
		map.put("lis2", list2);
		
		return map;
	}
	

}
