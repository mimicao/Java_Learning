package cn.laoliu_05;

import java.util.LinkedList;

public class MyStack {
	private LinkedList<Object> link;

	public MyStack() {
		link = new LinkedList<Object>();
	}

	public void add(Object obj) {
		link.addFirst(obj);
	}

	public Object get() {
		return link.removeFirst();
	}

	public boolean isEmpty() {
		if (link.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
