package cn.laoliu_03;

import java.util.LinkedList;

/*
 * LinkedList�����й���:
 * 		public void addFirst(E e)��addLast(E e)
 * 		public E getFirst()��getLast()
 * 		public E removeFirst()��public E removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("hello");
		list.add("world");
		list.add("java");

		list.addFirst("javaee");
		list.addLast("bb");
		
		System.out.println("list:"+list);
		System.out.println("LinkLast:"+list.getLast());
		System.out.println("LinkFirst:"+list.getFirst());
		System.out.println("removeLast:"+list.removeLast());
		System.out.println("removeFirst:"+list.removeFirst());
		
		System.out.println("list:"+list);
	}
}