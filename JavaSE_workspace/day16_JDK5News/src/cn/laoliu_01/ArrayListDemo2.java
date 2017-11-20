package cn.laoliu_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("mimicao", 20));
		list.add(new Student("memicao", 21));
		list.add(new Student("mamicao", 22));
		list.add(new Student("momicao", 23));
		list.add(new Student("mpmicao", 24));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("------------------");
		for(int i=0;i<list.size();i++){
			Student s = list.get(i);
			System.out.println(s);
		}
		
		System.out.println("------------------");
		for(Student s:list){
			System.out.println(s);
		}
	}
}
