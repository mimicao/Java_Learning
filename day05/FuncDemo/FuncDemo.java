import java.util.Scanner;

class FuncDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入三个数字：");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		System.out.println("----------------------------");		
		System.out.println("计算两数之和：x+y="+sum(x, y));
		
		System.out.println("----------------------------");
		System.out.println("计算两数中最大的数：maxval="+maxval(x, y));
		
		System.out.println("----------------------------");
		System.out.println("比较两个数是否相等：x==y is "+equal(x, y));

		System.out.println("----------------------------");
		System.out.println("计算三个数中最大的数：maxval3="+maxval3(x, y, z));
		
	}
	
	public static int sum(int a, int b){
		return (a+b);
	}
	
	public static int maxval(int a, int b){
		return ((a>b)?a:b);
	}
	
	public static boolean equal(int a, int b){
		return (a==b);
	}
	
	public static int maxval3(int a, int b, int c){
		return ((a>b)?((a>c)?a:c):((b>c)?b:c));
	}
	
}
