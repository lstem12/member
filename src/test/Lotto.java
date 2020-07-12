package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
	public List<Integer> lotto(List<Integer> lottoNum){
		Random ran = new Random();

		for (int i = 0; i <= 5; i++) {
			lottoNum.add(ran.nextInt(45) + 1);
			for (int j = i - 1; j >= 0; j--) {
				if (lottoNum.get(j) == lottoNum.get(i)) {
					i--;
				}
			}
		}
		
		return lottoNum;
	}
	public List<Integer> sortList(List<Integer> lottoNum, List<Integer> arrLotto) {
		int lotto[] = new int[lottoNum.size()];
		int tmp = 0;
		for(int i=0;i<lottoNum.size();i++) {
			lotto[i] =lottoNum.get(i);
		}
		for(int i=0;i<lotto.length;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		for(int i=0; i<lotto.length;i++) {
			arrLotto.add(lotto[i]);
		}
		return arrLotto;
	}
	
	public static void main(String[] args) {
		List<Integer> lottoNum = new ArrayList<>();
		List<Integer> arrLotto= new ArrayList<>();
		
		Lotto lo = new Lotto();
		lo.lotto(lottoNum);
		lo.sortList(lottoNum,arrLotto);
		System.out.println("로또 : "+arrLotto);
	}
}
