package cn.laoliu_04;

public class InterDemo {
	public static void main(String[] args) {
		Inter<String> s = new InterImpl<String>();
		s.show("hello");
		
		Inter<Integer> i = new InterImpl<Integer>();
		i.show(100);
	}
}
