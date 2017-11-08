package cn.laoliu_02;

import java.math.BigInteger;

/*
 * public BigInteger add(BigInteger val)
 * public BigInteger subtract(BigInteger val)
 * public BigInteger multiply(BigInteger val)
 * public BigInteger divide(BigInteger val)
 * public BigInteger[] divideAndRemainder(BigInteger val)
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger n1 = new BigInteger("120");
		BigInteger n2 = new BigInteger("50");

		System.out.println("add:" + n1.add(n2));
		System.out.println("subtract:" + n1.subtract(n2));
		System.out.println("multiply:" + n1.multiply(n2));
		System.out.println("divide:" + n1.divide(n2));

		BigInteger[] bis = n1.divideAndRemainder(n2);
		System.out.println("divideAndRemainder:" + bis[0]);
		System.out.println("divideAndRemainder:" + bis[1]);

	}
}
