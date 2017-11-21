package cn.laoliu_08;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getNum() - s1.getNum();
				int num1 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
				int num2 = num1 == 0 ? s2.getEnglish() - s1.getEnglish() : num1;
				int num3 = num2 == 0 ? s2.getMath() - s1.getMath() : num2;
				int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName())
						: num3;
				return num4;
			}
		});

		System.out.println("ѧ����Ϣ¼�룡");
		// for (int i = 1; i <= 5; i++) {
		while (ts.size() < 5) {
			int i = ts.size() + 1;
			Scanner sc = new Scanner(System.in);
			System.out.println("�������" + i + "��ѧ��������");
			String name = sc.nextLine();
			System.out.println("�������" + i + "��ѧ�������ĳɼ�");
			String chinese = sc.nextLine();
			System.out.println("�������" + i + "��ѧ������ѧ�ɼ�");
			String math = sc.nextLine();
			System.out.println("�������" + i + "��ѧ����Ӣ��ɼ�");
			String english = sc.nextLine();

			ts.add(new Student(name, Integer.parseInt(chinese), Integer
					.parseInt(math), Integer.parseInt(english)));
		}
		System.out.println("ѧ����Ϣ¼����ϣ�");

		System.out.println("ѧ����Ϣ�Ӹߵ����������£�");
		for (Student s : ts) {
			System.out.println(s);
		}
	}
}