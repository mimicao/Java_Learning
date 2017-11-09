package cn.laoliu_01;
/*
 * 请把5个学生的信息存储到数组中，并遍历数组，获取每个学生的信息
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		Student s1 = new Student("mimicao", 80);
		Student s2 = new Student("memecao", 70);
		Student s3 = new Student("mamacao", 60);
		Student s4 = new Student("momocap", 50);
		Student s5 = new Student("mxmxcao", 40);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		for(int i=0; i<students.length; i++){
//			System.out.println(students[i]);
			System.out.println(students[i].getName()+"-----"+students[i].getAge());
		}
	}
}
