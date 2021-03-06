package cn.laoliu_03;

import java.util.HashSet;

public class DogDemo {
	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();

		Dog d1 = new Dog("旺财", 2, "金色", '男');
		Dog d2 = new Dog("小白", 3, "白色", '女');
		Dog d3 = new Dog("旺财", 5, "红色", '女');
		Dog d4 = new Dog("旺财", 2, "金色", '男');
		Dog d5 = new Dog("小刘", 2, "金色", '男');
		Dog d6 = new Dog("小刘", 3, "金色", '男');
		Dog d7 = new Dog("小刘", 3, "金色", '男');

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
