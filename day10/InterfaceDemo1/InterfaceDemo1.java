abstract class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void sleep() {
		System.out.println("��˯��");
	}
	
	public abstract void eat();
}

abstract class Sporter extends Person {
	public Sporter() {}
	
	public Sporter(String name, int age) {
		super(name, age);
	}
	
	public abstract void learning();
}

abstract class Coach extends Person {
	public Coach() {}
	
	public Coach(String name, int age) {
		super(name, age);
	}
	
	public abstract void teaching();
}

interface Speak {
	public abstract void speakingEnglish();
}

class PingPangSporter extends Sporter implements Speak {
	public PingPangSporter() {}
	
	public PingPangSporter(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("ƹ�����˶�Ա�Ըߵ���");
	}
	
	public void learning() {
		System.out.println("ƹ�����˶�Աѧϰ����ͽ���");
	}
	
	public void speakingEnglish() {
		System.out.println("ƹ�����˶�ԱѧӢ��");
	}
}

class BasketballSporter extends Sporter {
	public BasketballSporter() {}
	
	public BasketballSporter(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("�������˶�Ա�Ը�����");
	}
	
	public void learning() {
		System.out.println("�������˶�Աѧϰ�����Ͷ��");
	}
}

class PingPangCoach extends Coach implements Speak {
	public PingPangCoach() {}
	
	public PingPangCoach(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("ƹ�������Ա��ţ��");
	}
	
	public void teaching() {
		System.out.println("ƹ���������");
	}
	
	public void speakingEnglish() {
		System.out.println("ƹ�������ѧӢ��");
	}
}

class BasketballCoach extends Coach {
	public BasketballCoach() {}
	
	public BasketballCoach(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("���������Ա������");
	}
	
	public void teaching() {
		System.out.println("�����������");
	}
}

class InterfaceDemo1 {
	public static void main(String[] args) {
		PingPangSporter ps = new PingPangSporter();
		ps.setAge(22);
		ps.setName("���");
		System.out.println(ps.getName()+"------------"+ps.getAge());
		ps.eat();
		ps.sleep();
		ps.learning();
		ps.speakingEnglish();
		
		System.out.println("------------------------------------------");
		
		BasketballSporter bs = new BasketballSporter();
		bs.setAge(30);
		bs.setName("Ҧ��");
		System.out.println(bs.getName()+"------------"+bs.getAge());
		bs.eat();
		bs.sleep();
		bs.learning();
	
		System.out.println("------------------------------------------");
		
		PingPangCoach pc = new PingPangCoach();
		pc.setAge(50);
		pc.setName("�Ž���");
		System.out.println(pc.getName()+"------------"+pc.getAge());
		pc.eat();
		pc.sleep();
		pc.teaching();
		pc.speakingEnglish();
		
		System.out.println("------------------------------------------");
		
		BasketballCoach bc = new BasketballCoach();
		bc.setAge(45);
		bc.setName("˹��ά��");
		System.out.println(bc.getName()+"------------"+bc.getAge());
		bc.eat();
		bc.sleep();
		bc.teaching();
		
	}
}