package cn.laoliu_01;

/*
 * 线程安全
 * 安全-- 同步-- 数据是安全的
 * 不安全-- 不同步-- 效率高一些
 * 安全和效率永远困扰我们的。
 * 安全：医院的网站，银行的网站之类的
 * 效率：新闻性的网站，论坛之类的
 * 
 * StringBuffer：
 * 		线程安全的可变字串
 * 
 * StringBuffer和String的区别？
 * 	前者长度和内容可变，后者不变
 * 	如果使用前者做字符串拼接，不会浪费太多的资源
 * 
 * StringBuffer的构造方法
 * 		public StringBuffer(): 无参构造方法
 * 		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 * 		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
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
