package cn.laoliu_05;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println("i1==i2:" + (i1 == i2));
		System.out.println("i1 equal i2:" + i1.equals(i2));
		System.out.println("----------------");

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println("i3==i4:" + (i3 == i4));
		System.out.println("i3 equal i4:" + i3.equals(i4));
		System.out.println("----------------");

		Integer i5 = 127; 
		Integer i6 = 127;
		System.out.println("i5==i6:" + (i5 == i6));
		System.out.println("i5 equal i6:" + i5.equals(i6));
		System.out.println("----------------");

		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println("i7==i8:" + (i7 == i8));
		System.out.println("i7 equal i8:" + i7.equals(i8));
		System.out.println("----------------");
		
		//Integer数据直接赋值，如果在-128和127之间，会直接从缓冲池获取数据
		Integer ii = Integer.valueOf(127);
		System.out.println("ii==i7"+(ii == i6));
	}
}
