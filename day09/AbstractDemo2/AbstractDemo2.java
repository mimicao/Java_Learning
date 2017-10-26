/*
	猫狗案例
		具体事物：猫，狗
		共性：姓名，年龄，吃饭
	分析：从具体到抽象
		猫：
			成员变量：姓名，年龄
			构造方法：无参，有参
			成员方法：吃饭（猫吃鱼）
		狗：
			成员变量：姓名，年龄
			构造方法：无参，有参
			成员方法：吃饭（狗吃肉）

		因为有共性内容，所以就提取了一个父类：动物
		
	实现：从抽象到具体
		动物类：
			成员变量：姓名，年龄
			构造方法：无参，有参
			成员方法：吃饭();		
		狗类：
			继承自动物类
			重写吃饭
		猫类：
			继承自动物类
			重写吃饭
*/

abstract class Animal {
	private String name;
	private int age;
	
	//static abstract void show();//错误: 非法的修饰符组合:
	
	public static void method() {
		System.out.println("method");
	}
	
	public Animal() {}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public abstract void eat();
}

class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("狗吃肉");
	}
}
class AbstractDemo2 {
	public static void main(String[] args) {
		//Animal a = new Animal(); //错误: Animal是抽象的; 无法实例化
		Animal.method();
		
		Cat ca = new Cat();
		ca.setName("猫猫");
		ca.setAge(5);
		System.out.println(ca.getAge()+"-----------"+ca.getName());
		ca.eat();
		
		System.out.println("---------------------");
		Animal a = new Cat("猫贵", 20);
		System.out.println(a.getAge()+"-----------"+a.getName());
		a.eat();
		
		System.out.println("---------------------");
		a = new Dog();
		a.setAge(10);
		a.setName("小旺");
		System.out.println(a.getAge()+"-----------"+a.getName());
		a.eat();		
	}
}