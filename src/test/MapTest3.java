package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Float,String> map = new HashMap<>();
		
		map.put(1.0f, "플룻1");
		map.put(2.0f, "플룻2");
		map.put(3.0f, "플룻3");
		
		Iterator<Float> it = map.keySet().iterator();
		while(it.hasNext()) {
			Float key = it.next();
			System.out.println(key+": "+map.get(key));
		}

	}
}
