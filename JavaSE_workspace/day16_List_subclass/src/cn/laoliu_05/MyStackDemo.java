package cn.laoliu_05;

public class MyStackDemo {
	public static void main(String[] args) {
		MyStack sk = new MyStack();

		sk.add("hello");
		sk.add("world");
		sk.add("java");

		while (!sk.isEmpty()) {
			String s = (String) sk.get();
			System.out.println(s);
		}
	}
}
