package cn.laoliu_01;

/*
 * public static int abs(int a) ���� double ֵ�ľ���ֵ��
 * public static double ceil(double a) ����ȡ��
 * public static double floor(double a) ����ȡ��
 * public static int max(int a,int b) min��ѧ
 * public static double pow(double a,double b) x^y
 * public static double random() ����� ����ֵС��1����0
 * public static int round(float a) ����Ϊdouble����ѧ, ��������
 * public static double sqrt(double a) ����
 */
public class MathDemo {
	public static void main(String[] args) {

		System.out.println("E:" + Math.E);
		System.out.println("PI:" + Math.PI);

		System.out.println(Math.abs(-100));
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));

		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));

		System.out.println(Math.max(10, 20));

		System.out.println(Math.pow(10, 2));

		System.out.println(Math.random());

		System.out.println(Math.round(12.34f));
		System.out.println(Math.round(12.56f));
		
		System.out.println(Math.sqrt(4));
		
		

	}
}