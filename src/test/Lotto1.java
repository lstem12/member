package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {
		List<Integer> lottoNum = new ArrayList<>();
		Random ran = new Random();
		for (int i = 0; i <= 5; i++) {
			lottoNum.add(ran.nextInt(45) + 1);
			for (int j = i - 1; j >= 0; j--) {
				if (lottoNum.get(j) == lottoNum.get(i)) {
					i--;
				}
			}
		}
		System.out.println(lottoNum);
	}
}
