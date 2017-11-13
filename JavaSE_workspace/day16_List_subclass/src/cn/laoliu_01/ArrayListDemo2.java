package cn.laoliu_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * array存储自定义对象
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();

		Student s1 = new Student("mimicao", 25);
		Student s2 = new Student("mamicao", 27);
		Student s3 = new Student("memicao", 28);
		Student s4 = new Student("mcmicao", 29);
		Student s5 = new Student("mhmicao", 30);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}

		System.out.println("----------------");
		for (int i = 0; i < array.size(); i++) {
			Student s = (Student) array.get(i);
			System.out.println(s);
		}
	}
}
