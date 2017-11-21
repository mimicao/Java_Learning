package cn.laoliu_07;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int num = s1.getName().length() - s1.getName().length();
		int num1 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
		int num2 = num1 == 0 ? s1.getAge() - s2.getAge() : num1;
		return num2;
	}

}
