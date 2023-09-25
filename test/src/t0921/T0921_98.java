package t0921;

import java.util.HashSet;
import java.util.Iterator;

public class T0921_98 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("a");
		set.add("b");
		set.add("d");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
