package cn.laoliu_02;

import com.laoliu_02.Animal;
import com.laoliu_02.Cat;
import com.laoliu_02.Dog;

public class AnimalDemo {
	public static void main(String[] args) {
		//�����಻�ܱ�ʵ����
		//Animal a = new Animal();
		
		Animal a = new Cat();
		a.eat();
		a.sleep();
		
		System.out.println("-----------------");
		
		a = new Dog();
		a.eat();
		a.sleep();
		
		System.out.println("-----------------");
		
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.jump();
			
	}
}