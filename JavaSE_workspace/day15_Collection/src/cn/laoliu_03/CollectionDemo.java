package cn.laoliu_03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();

		c.add("Hello");
		c.add("World");
		c.add("Java");

		Object[] objs = c.toArray();

		for (int i = 0; i < objs.length; i++) {
			// System.out.println(objs[i]);

			String s = (String) objs[i];
			System.out.println(objs[i] + "---" + s.length());
		}

	}
}
