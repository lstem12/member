package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest5 {

	public static void main(String[] args) {
		String[] strs = { "한식", "양식", "중식", "일식" };
		List<String> strList = new ArrayList<>();
		Random r = new Random();
		int[] count = new int[4];

		for (int i = 1; i <= 20; i++) {
			int idx = r.nextInt(strs.length);
			strList.add(strs[idx]);
		}
		for (int i = 0; i < strList.size(); i++) {
			for (int j = 0; j < strs.length; j++) {
				if (strList.get(i).equals(strs[j])) {
					count[j] += 1;
				}
			}
		}
		for (int j = 0; j < strs.length; j++) {
			System.out.println(strs[j] + " 갯수 : " + count[j]);
		}
	}
}
