package t0922;

import java.util.ArrayList;
import java.util.HashMap;

public class TAction {
	
	ArrayList<Car> list = new ArrayList();
	ArrayList<StuScore> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();
	
	HashMap cal(String[] color, int[] door, String[] name, int[] kor, int[] eng, int[] math) {
		list.add(new Car(color[0],door[0]));
		list.add(new Car(color[1],door[1]));
		list.add(new Car(color[2],door[2]));
		
		list2.add(new StuScore(name[0],kor[0],eng[0],math[0]));
		list2.add(new StuScore(name[1],kor[1],eng[1],math[1]));
		list2.add(new StuScore(name[2],kor[2],eng[2],math[2]));
		
		map.put("list", list);
		map.put("list2", list2);
		
		return map;
	}

}
