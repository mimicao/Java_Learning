package cn.laoliu_04;

import java.util.ArrayList;
import java.util.List;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("world");
		list.add("java");

		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// if ("world".equals(s)) {
		// // ConcurrentModificationException
		// // list.add("javaee");
		// }
		// }

		// ListIterator lit = list.listIterator();
		// while (lit.hasNext()) {
		// String s = (String) lit.next();
		// if ("world".equals(s)) {
		// lit.add("javaee");
		// }
		// // System.out.println(s); //此时lit没有被重新更新，需要冲洗初始化迭代器
		// }

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			if (s.equals("world")) {
				list.add(i + 1, "javaee");
			}
		}

		System.out.println("list:" + list);
	}
}
