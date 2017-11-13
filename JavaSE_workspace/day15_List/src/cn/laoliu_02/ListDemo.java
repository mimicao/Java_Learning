package cn.laoliu_02;

/*
 * void add(int index,E element)
 * E remove(int index)
 * E get(int index)
 * E set(int index,E element)
 * ListIterator listIterator()
 */
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("world");
		list.add(2, "mac");

		System.out.println("get:" + list.get(1));
		System.out.println("list:" + list);

		list.remove(0);

		System.out.println("list:" + list);

		System.out.println("set:" + list.set(0, "hello"));
		System.out.println("list:" + list);
	}
}
