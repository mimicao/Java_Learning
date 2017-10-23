class Student{
	String name;
	private int age;
	
	public void setAge(int a){
		if(a<0 || age>150){
			System.out.println("你输入的年龄有问题");
		}else{
			age = a;
		}
	}
	
	public void printinfo(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "草莓";
		//s.age = 33;
		s.setAge(30);
		s.printinfo();
		
		System.out.println("------------------");		
		s.setAge(-99);
		s.printinfo();

		System.out.println("------------------");	
		
	}
}