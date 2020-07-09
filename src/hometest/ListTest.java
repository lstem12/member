package hometest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student{
	private String name;
	private int num;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", score=" + score + "]";
	}

	
}
public class ListTest {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		int[] count = new int[5];
		Random ra = new Random();
		
		for(int i=1;i<=5;i++) {
		Student st = new Student();
		stList.add(st);
		st.setName("이름"+i);
		st.setNum(ra.nextInt(5)+1);
		st.setScore(ra.nextInt(51)+50);
		}
		int max=0;
		int idx=0;
		
		for(int i=0;i<stList.size();i++) {
			Student std = stList.get(i);
			if(std.getScore()>max) {
				max=std.getScore();
				idx = i;
			}
			if(std.getNum()==1) {
				count[0] +=1;
			}else if(std.getNum()==2) {
				count[1] +=1;
			}else if(std.getNum()==3) {
				count[2] +=1;
			}else if(std.getNum()==4) {
				count[3] +=1;
			}else if(std.getNum()==5) {
				count[4] +=1;
			}
			System.out.println(std);
		}
		System.out.println();
		System.out.println("최고점수:"+max+" 최고점수 학생정보 :"+ stList.get(idx));
		System.out.println("1번 :"+count[0]+" 2번 :"+count[1]+" 3번 :"+count[2]+" 4번 :"+count[3]+" 5번 :"+count[4]);
	}
}
