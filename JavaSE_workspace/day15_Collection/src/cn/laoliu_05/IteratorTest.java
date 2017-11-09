package cn.laoliu_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		Student s1 = new Student("mimicao", 80);
		Student s2 = new Student("memecao", 70);
		Student s3 = new Student("mamacao", 60);
		Student s4 = new Student("momocao", 50);
		Student s5 = new Student("mxmxcao", 40);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Iterator it = c.iterator();

		while (it.hasNext()) {
			// System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
