/*
����¼���������ݣ�����������������ͣ��������
����¼���������ݣ���ȡ�����������е����ֵ
����¼���������ݣ���ȡ�����������е����ֵ
����¼���������ݣ��Ƚ������������Ƿ����
*/

import java.util.Scanner;

class ScannerDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your data1: ");
		int x = sc.nextInt();
		
		System.out.println("Please input your data2: ");
		int y = sc.nextInt();	

		System.out.println("Please input your data3: ");
		int z = sc.nextInt();	
		
		System.out.println("Data is "+"x+y="+(x+y));
		
		System.out.println("Data is "+"max1="+((x>y)?x:y));

		System.out.println("Data is "+"max2="+((x>y)?((x>z)?x:z):((y>z)?y:z)));
		
		System.out.println("Data is "+"x==y is "+(x==y));
	}
}