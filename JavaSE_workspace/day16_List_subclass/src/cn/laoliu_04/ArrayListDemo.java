package cn.laoliu_04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("javaee");
		array.add("hello");
		array.add("java");
		System.out.println("array:" + array);

		ArrayList<String> array1 = new ArrayList<String>();

		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();

			if (array1.contains(s) == false) {
				array1.add(s);
			}
		}
		System.out.println("array1:" + array1);

		ArrayList<String> array2 = new ArrayList<String>();
		for (int i = 0; i < array.size(); i++) {
			String s = (String) array.get(i);
			if (array2.contains(s) == false) {
				array2.add(s);
			}
		}
		System.out.println("array2:"+array2);
	}
}
