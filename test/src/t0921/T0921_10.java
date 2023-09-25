package t0921;

import java.util.ArrayList;
import java.util.HashMap;

public class T0921_10 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap();
		ColAction col = new ColAction();
		
		map = col.scoreAll();
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");
		for(int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%s,%d,%d,%d\n",s.getName(),s.getKor(),s.getEng(),s.getMath());
		}
		
		
		
		

	}

}
