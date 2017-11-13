package cn.laoliu_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest2 {
	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();

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

		Iterator<Student> it = c.iterator();
		while (it.hasNext()) {
			 Student s = (Student)it.next();
			 System.out.println(s.getName()+"---"+s.getAge());

			// NoSuchElementException: 不要多次使用next
			// System.out.println(((Student) it.next()).getName() + "---"
			// + ((Student) it.next()).getAge());
		}

		// for循环可以节省it这个值分配的空间
		// for(Iterator it = c.iterator();it.hasNext();){
		// Student s = (Student)it.next();
		// System.out.println(s.getName()+"---"+s.getAge());
		// }
	}
}
