package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student{
	private String name;
	private int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
}

public class ListTest {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		
		for(int i=1;i<=5;i++) {
			Student st2 = new Student();
			stList.add(st2);
			st2.setName("이름"+i);
			st2.setGrade(r.nextInt(10)+1);	
		}
		for(int i=0;i<stList.size();i++) {
			Student st = stList.get(i);
			if(i%2 == 1) {
				System.out.println("student["+i+"]"+"이름 :"+st.getName()+" 학년 :"+st.getGrade());
			}
		}
	}
}
