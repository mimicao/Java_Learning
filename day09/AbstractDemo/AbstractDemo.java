/*
������ĸ���. 09.18
*/

abstract class Animal {
	public abstract void eat();
	
	public Animal() {}
}

//�����ǳ�����
abstract class Dog extends Animal {}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//Animal a = new Animal();
		Animal a = new Cat();
		a.eat();
	}
}