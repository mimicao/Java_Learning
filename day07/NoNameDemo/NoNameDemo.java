/*
��������: û�����ֵĶ���

���������ʹ�ó���:
	1. ���÷���: ����ʹ��һ�ε�ʱ��
		ע��: ���ö�ε�ʱ�򣬲��ʺϡ�
	2. �ô�: �������������Ͼ������������Ա���������������
*/

class Student{
	public void show(){
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo{
	public void method(Student s){
		s.show();
	}
}

class NoNameDemo{
	public static void main(String[] args){
		//���ö������
		Student s = new Student();
		s.show();
		s.show();//ͬһ��������ʹ������
		
		System.out.println("---------------------");
		//��������ĵ��÷���
		new Student().show();
		new Student().show();//����������������
		
		System.out.println("---------------------");
		//����������ʵ�ʲ���
		new StudentDemo().method(new Student());
	}
}