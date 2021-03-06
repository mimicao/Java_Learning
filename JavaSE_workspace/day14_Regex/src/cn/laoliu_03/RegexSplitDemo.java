package cn.laoliu_03;

public class RegexSplitDemo {
	public static void main(String[] args) {
		String s = "helloaaaWorld";
		String regex = "a{2}";
//		String regex = "a{3}";
//		String regex = "a";

		String[] sp = s.split(regex);

		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		System.out.println("----------------------");
		String s1 = "aa,bb,cc";
		String regex1 = ",";
		String[] sp1 = s1.split(regex1);
		for (int i = 0; i < sp1.length; i++) {
			System.out.println(sp1[i]);
		}
		
		System.out.println("----------------------");
		String s2 = "aca.bcb.ccc";
		String regex2 = "\\.";
		String[] sp2 = s2.split(regex2);
		for (int i = 0; i < sp2.length; i++) {
			System.out.println(sp2[i]);
		}
		
		System.out.println("----------------------");
		String s3 = "ada         bdb                  cdc";
		String regex3 = " +";
		String[] sp3 = s3.split(regex3);
		for (int i = 0; i < sp3.length; i++) {
			System.out.println(sp3[i]);
		}
		
		System.out.println("----------------------");
		String s4 = "D:\\Private\\Project\\Java\\Java_Learning";
		String regex4 = "\\\\";
		String[] sp4 = s4.split(regex4);
		for (int i = 0; i < sp4.length; i++) {
			System.out.println(sp4[i]);
		}
	}
}
