package cn.laoliu_04;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("world");
		lhs.add("java");

		for (String s : lhs) {
			System.out.println(s);
		}
	}
}
