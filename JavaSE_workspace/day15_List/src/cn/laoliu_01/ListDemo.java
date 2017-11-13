package cn.laoliu_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		list.add("java");
		list.add(2, "mac");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
