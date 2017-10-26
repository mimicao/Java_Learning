//����ӿ�
interface Jumpping {
	public abstract void jump();
}

//���������
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
		System.out.println("è����");
	}
}

class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("������");
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
		JumpCat cat = new JumpCat("èè", 10);
		System.out.println(cat.getAge()+"------"+cat.getName());
		cat.jump();
		cat.eat();
		cat.sleep();
		
		JumpDog dog = new JumpDog("С��", 20);
		System.out.println(dog.getAge()+"------"+dog.getName());
		dog.jump();
		dog.eat();
		dog.sleep();		
	}
}