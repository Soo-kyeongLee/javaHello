package prac.wk2.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		String arr[]=new String[] {"Kim","Lee","Park","Choi","Hawng","Gu","Keum","Cha","Ryu"};
		System.out.println("Student List (ordered by name)");
		
		Random rand=new Random();
		int upperBound=arr.length;
		for(int i=0;i<10;i++) {
			int num=rand.nextInt(upperBound);
			int age=rand.nextInt(20)+5;
			Student s=new Student(i,arr[num],age);
			list.add(s);
		}
		
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (descending)");
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
