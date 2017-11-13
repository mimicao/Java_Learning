package cn.laoliu_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("world");
		list.add("java");

		ListIterator<String> lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			System.out.println(s);
		}
		
		System.out.println("----------");

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

		System.out.println("----------");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}
}
