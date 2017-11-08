package cn.laoliu_01;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ("name:" + name + "---age:" + age);
		// return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("free:" + this);
		super.finalize();
	}

}
