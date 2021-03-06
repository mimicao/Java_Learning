package cn.laoliu_01;

/*
 * public static int abs(int a) 返回 double 值的绝对值。
 * public static double ceil(double a) 向上取整
 * public static double floor(double a) 向下取整
 * public static int max(int a,int b) min自学
 * public static double pow(double a,double b) x^y
 * public static double random() 随机数 返回值小于1大于0
 * public static int round(float a) 参数为double的自学, 四舍五入
 * public static double sqrt(double a) 开方
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
