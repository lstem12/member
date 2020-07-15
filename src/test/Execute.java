package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person("이름234",16,89));
		pList.add(new Person("이54",27,90));
		pList.add(new Person("이34",102,66));
		pList.add(new Person("이87",56,87));
		Collections.sort(pList);
		System.out.print(pList);
		
	}
}
