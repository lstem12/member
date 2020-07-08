package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		List<Integer> lottonum = new ArrayList<>();
		Random ran = new Random();
		
		for (int i=0; i<=5; i++) {
			lottonum.add(ran.nextInt(45) + 1);
			for (int j = i-1; j >= 0; j--) {
				if (lottonum.get(j) == lottonum.get(i)) {
					i--;
				}
			}
		}
		
		System.out.println(lottonum);

	}
}
