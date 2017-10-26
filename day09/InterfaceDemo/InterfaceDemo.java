//定义接口
interface Jumpping {
	public abstract void jump();
}

//定义抽象类
abstract class Animal {
	private String name;
	private int age;
	
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
	
	public void sleep() {
		System.out.println("Animal need to sleep");
	}
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

class JumpCat extends Cat implements Jumpping {
	public JumpCat() {}
	
	public JumpCat(String name, int age) {
		super(name, age);
	}
	
	public void jump() {
		System.out.println("Jump Cat");
	}
}

class JumpDog extends Dog implements Jumpping {
	public JumpDog() {}
	
	public JumpDog(String name, int age) {
		super(name, age);
	}
	
	public void jump() {
		System.out.println("Jump Dog");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		JumpCat cat = new JumpCat("猫猫", 10);
		System.out.println(cat.getAge()+"------"+cat.getName());
		cat.jump();
		cat.eat();
		cat.sleep();
		
		JumpDog dog = new JumpDog("小旺", 20);
		System.out.println(dog.getAge()+"------"+dog.getName());
		dog.jump();
		dog.eat();
		dog.sleep();		
	}
}