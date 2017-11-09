package cn.laoliu_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator(): 迭代器，集合的专用便利方式
 * 		Object next(): 获取元素并移动到下一个位置
 * 			NoSuchElementException: 没有这样的元素，已经找到最后了
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("hello");
		c.add("world");
		c.add("Java");

		Iterator it = c.iterator();

		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());

		// 最后一个不应该写，在每次获取前作需要判断
		while (it.hasNext()) {
			// System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
