package cn.laoliu_03;

import java.util.HashSet;

public class DogDemo {
	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();

		Dog d1 = new Dog("����", 2, "��ɫ", '��');
		Dog d2 = new Dog("С��", 3, "��ɫ", 'Ů');
		Dog d3 = new Dog("����", 5, "��ɫ", 'Ů');
		Dog d4 = new Dog("����", 2, "��ɫ", '��');
		Dog d5 = new Dog("С��", 2, "��ɫ", '��');
		Dog d6 = new Dog("С��", 3, "��ɫ", '��');
		Dog d7 = new Dog("С��", 3, "��ɫ", '��');

		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);

		for (Dog d : hs) {
			System.out.println(d);
		}

	}
}