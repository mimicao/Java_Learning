package cn.laoliu_02;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

		Student s1 = new Student("mimicao", 22);
		Student s2 = new Student("mamicao", 23);
		Student s3 = new Student("memicao", 24);
		Student s4 = new Student("momicao", 25);
		Student s5 = new Student("mimicao", 26);
		Student s6 = new Student("mimicao", 22);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		for (Student s : hs) {
			System.out.println(s.hashCode() + "\t-----" + s);
		}
	}
}
