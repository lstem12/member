package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		
		m.put("age", 0);
		for(int i=10;i<=50;i++) {
			m.get("age");
			int sum = m.get("age")+i;
			m.put("age",sum);
		}
		System.out.println(m);
	}
}
