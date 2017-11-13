package cn.laoliu_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector�����й���
 * 1.��ӹ���
 * 
 * 2.��ȡ����
 * 		public E elementAt(int index)
 * 		public Enumeration elements()
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		for (int i = 0; i < v.size(); i++) {
			String s = (String) v.elementAt(i);
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			String s = (String)e.nextElement();
			System.out.println(s);
		}
		
	}
}
