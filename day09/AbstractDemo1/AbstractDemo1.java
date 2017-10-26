/*
	抽象类的成员特点
		成员变量: 既可以是变量，也可以是自定义常量
		构造方法: 用于子类访问父类数据的初始化
		成员方法: 既可以是抽象的，也可以是非抽象
		
	抽象类的成员方法特性
	1.抽象方法 强制要求子类做的事情
	2.非抽象方法 子类继承的事情，提高代码的复用性
*/
abstract class Animal {
	public int num = 10;
	public final int num2 = 20;
	
	public Animal() {}
	
	public Animal(String name, int age) {}
	
	public abstract void show();
	
	public void method() {
		System.out.println("show method");
	}
}

class Dog extends Animal {
	public void show() {
		System.out.println("show Dog");
	}
}

class AbstractDemo1 {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.num = 30;
		System.out.println(a.num);
		//a.num2 = 100;
		System.out.println(a.num2);
		
		a.show();
		a.method();
		
	}
}