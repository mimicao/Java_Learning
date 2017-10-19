/*
键盘录入两个数据，并对这两个数据求和，输出其结果
键盘录入两个数据，获取这两个数据中的最大值
键盘录入三个数据，获取这三个数据中的最大值
键盘录入两个数据，比较这两个数据是否相等
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