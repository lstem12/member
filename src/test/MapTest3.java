package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class MapTest3 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		Random r = new Random();

		for (int i = 0; i <= 5; i++) {
			map.put(i, r.nextInt(45) + 1);
			for (int j = i-1; j >= 0; j--) {
				if (map.get(j) == map.get(i)) {
					i--;
				}
			}
		}

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			if (key == map.size()-1) {
				System.out.print(map.get(key));
			} else {
				System.out.print(map.get(key) + ", ");
			}
		}
	}
}
