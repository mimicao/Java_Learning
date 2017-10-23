class Person {
	String name;
	int age;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person {
	public void eat() {
		System.out.println("Eat food~");
	}
	
	public void show() {
		System.out.println(name);
	}
}

class InheritDemo {
	Student s = new Student();
	
	s.setAge(10);
	s.setName("Caomei");
	s.show();
}