/*
Usage of private
*/
class Student{
	private String name;
	private int age;
	
	public void setName(String name){
		this name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this age = age;
	}
	
	public int getAge(){
		return age;
	}
}

class PrivateDemo{
	public static void main(String[] args){
		Student s = new Student();
		
		System.out.println("������"+s.getName()+"\n����"+s.getAge());
		
		System.out.println("-------------------");
		s.setName("��ݮ");
		s.setAge(10);
		
		System.out.println("������"+s.getName()+"\n����"+s.getAge());
		
	}
}