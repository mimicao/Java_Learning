package cn.laoliu_01;

/*
 * �̰߳�ȫ
 * ��ȫ-- ͬ��-- �����ǰ�ȫ��
 * ����ȫ-- ��ͬ��-- Ч�ʸ�һЩ
 * ��ȫ��Ч����Զ�������ǵġ�
 * ��ȫ��ҽԺ����վ�����е���վ֮���
 * Ч�ʣ������Ե���վ����̳֮���
 * 
 * StringBuffer��
 * 		�̰߳�ȫ�Ŀɱ��ִ�
 * 
 * StringBuffer��String������
 * 	ǰ�߳��Ⱥ����ݿɱ䣬���߲���
 * 	���ʹ��ǰ�����ַ���ƴ�ӣ������˷�̫�����Դ
 * 
 * StringBuffer�Ĺ��췽��
 * 		public StringBuffer(): �޲ι��췽��
 * 		public StringBuffer(int capacity):ָ���������ַ�������������
 * 		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb capacity:" + sb.capacity());
		System.out.println("sb length:" + sb.length());

		System.out.println("--------------------------");
		StringBuffer sb1 = new StringBuffer(50);
		System.out.println("sb1:" + sb1);
		System.out.println("sb1 capacity:" + sb1.capacity());
		System.out.println("sb1 length:" + sb1.length());

		System.out.println("--------------------------");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println("sb2:" + sb2);
		System.out.println("sb2 capacity:" + sb2.capacity());
		System.out.println("sb2 length:" + sb2.length());
	}
}
