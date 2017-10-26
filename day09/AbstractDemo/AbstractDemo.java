/*
抽象类的概述. 09.18
*/

abstract class Animal {
	public abstract void eat();
	
	public Animal() {}
}

//子类是抽象类
abstract class Dog extends Animal {}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//Animal a = new Animal();
		Animal a = new Cat();
		a.eat();
	}
}