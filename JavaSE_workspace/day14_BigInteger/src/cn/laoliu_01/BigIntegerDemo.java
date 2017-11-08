package cn.laoliu_01;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(2147483647);
		System.out.println(Integer.MAX_VALUE);
		Integer i2 = new Integer(2147483647);
		
		System.out.println(i1+i2);
		
		BigInteger bi1=new BigInteger("2147483647");
		BigInteger bi2=new BigInteger("2147483647");
		
		System.out.println(bi1.add(bi2));
	}
}
