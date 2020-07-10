package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest4 {

	public static void main(String[] args) {
		Map<Float,String> map = new HashMap<>();
		map.put(1.1f, "1.1 Float 입니다");
		map.put(2.1f, "2.1 Float 입니다");
		map.put(3.1f, "3.1 Float 입니다");
		map.put(4.1f, "4.1 Float 입니다");
		//containsKey (가지고 있는지를 물어보는거)
		Iterator<Float> it = map.keySet().iterator();
		while(it.hasNext()) {
			Float key = it.next();
			System.out.println(key +": "+map.get(key));
		}
	}
}
