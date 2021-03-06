package cn.laoliu_01;

/*
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int scale,
 *      int roundingMode)
 */
import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		System.out.println(1.015 * 100);
		System.out.println(1.301 / 100);
		System.out.println(1.0 - 0.12);

		System.out.println("--------------------------");
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));

		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:" + bd5.multiply(bd6));

		BigDecimal bd7 = new BigDecimal("1.315");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));
		System.out.println("divide:"
				+ bd7.divide(bd8, 4, BigDecimal.ROUND_HALF_DOWN));
		System.out.println("divide:"
				+ bd7.divide(bd8, 4, BigDecimal.ROUND_HALF_EVEN));
		System.out.println("divide:"
				+ bd7.divide(bd8, 4, BigDecimal.ROUND_HALF_UP));

	}
}
