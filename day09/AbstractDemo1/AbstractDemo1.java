/*
	������ĳ�Ա�ص�
		��Ա����: �ȿ����Ǳ�����Ҳ�������Զ��峣��
		���췽��: ����������ʸ������ݵĳ�ʼ��
		��Ա����: �ȿ����ǳ���ģ�Ҳ�����Ƿǳ���
		
	������ĳ�Ա��������
	1.���󷽷� ǿ��Ҫ��������������
	2.�ǳ��󷽷� ����̳е����飬��ߴ���ĸ�����
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