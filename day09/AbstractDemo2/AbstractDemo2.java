/*
	è������
		�������è����
		���ԣ����������䣬�Է�
	�������Ӿ��嵽����
		è��
			��Ա����������������
			���췽�����޲Σ��в�
			��Ա�������Է���è���㣩
		����
			��Ա����������������
			���췽�����޲Σ��в�
			��Ա�������Է��������⣩

		��Ϊ�й������ݣ����Ծ���ȡ��һ�����ࣺ����
		
	ʵ�֣��ӳ��󵽾���
		�����ࣺ
			��Ա����������������
			���췽�����޲Σ��в�
			��Ա�������Է�();		
		���ࣺ
			�̳��Զ�����
			��д�Է�
		è�ࣺ
			�̳��Զ�����
			��д�Է�
*/

abstract class Animal {
	private String name;
	private int age;
	
	//static abstract void show();//����: �Ƿ������η����:
	
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
class AbstractDemo2 {
	public static void main(String[] args) {
		//Animal a = new Animal(); //����: Animal�ǳ����; �޷�ʵ����
		Animal.method();
		
		Cat ca = new Cat();
		ca.setName("èè");
		ca.setAge(5);
		System.out.println(ca.getAge()+"-----------"+ca.getName());
		ca.eat();
		
		System.out.println("---------------------");
		Animal a = new Cat("è��", 20);
		System.out.println(a.getAge()+"-----------"+a.getName());
		a.eat();
		
		System.out.println("---------------------");
		a = new Dog();
		a.setAge(10);
		a.setName("С��");
		System.out.println(a.getAge()+"-----------"+a.getName());
		a.eat();		
	}
}