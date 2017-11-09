package cn.laoliu_04;

import java.util.ArrayList;
import java.util.Collection;

import cn.laoliu_04.Student;

public class StudentDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Student s1 = new Student("mimicao", 80);
		Student s2 = new Student("memecao", 70);
		Student s3 = new Student("mamacao", 60);
		Student s4 = new Student("momocap", 50);
		Student s5 = new Student("mxmxcao", 40);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Object[] objs = c.toArray();
		
		for(int i=0;i<objs.length;i++){
			Student s = (Student) objs[i];
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}