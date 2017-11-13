package cn.laoliu_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List的子类特点
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低 
 * 		LinkedList
 * 			底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");

		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("-----------------");
		
		for (int i = 0; i < array.size(); i++) {
			String s = (String) array.get(i);
			System.out.println(s);
		}

	}
}
