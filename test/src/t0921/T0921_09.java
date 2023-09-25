package t0921;

import java.util.HashMap;

public class T0921_09 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap();
		map.put("id", "aaa");
		map.put("page", "11");
		map.put("count", "105");
		
		System.out.println("id : "+map.get("id"));

	}

}
