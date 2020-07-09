package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,Object> m = new HashMap<>();
		
		m.put("name", "애쉬");
		m.put("power", 30);
		m.put("defense", 50);
		m.put("level", 10);
		m.put("speed", 300);
		
		Iterator<String> it = m.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : "+ m.get(key));
		}
	}
}
