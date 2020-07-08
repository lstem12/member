package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		strList.add("4");
		System.out.println(strList);
		
		Map<String,String> map = new HashMap<>();
		map.put("4", "1");
		map.put("3", "3");
		map.put("2", "4");
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
		
	}
}
