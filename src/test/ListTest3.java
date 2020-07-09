package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		String[] fNames = {"김","이","박","최","맹","신","조"};
		String[] lNames = {"동동","나나","진수","명희","철수","명호","둘리"};
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		
		for(int i=1;i<=20;i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student st = new Student();
			st.setName(fName + lName);
			st.setGrade(r.nextInt(3)+1);
			stList.add(st);			
		}
		List<Student> oneList = new ArrayList<>();
		List<Student> twoList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();
		for(Student st:stList) {

			if(st.getGrade()==1) {
				oneList.add(st);
			}
			if(st.getGrade()==2) {
				twoList.add(st);
			}
			if(st.getGrade()==3) {
				threeList.add(st);
			}
		}

		if(oneList.size() >0) {
			System.out.print("1학년 : " + oneList.size() + "명  ");
			for(Student st : oneList) {
				System.out.print(st.getName() + ",");
			}
			System.out.println();
		}
		if(twoList.size() >0) {
			System.out.print("2학년 : " + twoList.size() + "명  ");
			for(Student st : twoList) {
				System.out.print(st.getName() + ",");
			}
			System.out.println();
		}
		if(threeList.size() >0) {
			System.out.print("3학년 : " + threeList.size() + "명  ");
			for(Student st : threeList) {
				System.out.print(st.getName() + ",");
			}
			System.out.println();
		}
	}
}

/*for(Student st:stList) {
System.out.println(st);dd
}*/
