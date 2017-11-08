package cn.laoliu_01;

/*
 * public static boolean isUpperCase(char ch)
 * public static boolean isLowerCase(char ch)
 * public static boolean isDigit(char ch)
 * public static char toUpperCase(char ch)
 * public static char toLowerCase(char ch)
 */
public class CharacterDemo {
	public static void main(String[] args) {
		// Character ch = new Character((char) 97);
		Character ch = new Character('a');
		System.out.println("ch:" + ch);
		
		System.out.println("isUpperCase:"+Character.isUpperCase('A'));
		System.out.println("isUpperCase:"+Character.isUpperCase('a'));
		System.out.println("isUpperCase:"+Character.isUpperCase('1'));
		System.out.println("---------------------------------------");
		
		System.out.println("isLowerCase:"+Character.isLowerCase('A'));
		System.out.println("isLowerCase:"+Character.isLowerCase('a'));
		System.out.println("isLowerCase:"+Character.isLowerCase('1'));
		System.out.println("---------------------------------------");
		
		System.out.println("isDigit:"+Character.isDigit('A'));
		System.out.println("isDigit:"+Character.isDigit('a'));
		System.out.println("isDigit:"+Character.isDigit('1'));
		System.out.println("---------------------------------------");
		
		System.out.println("toUpperCase:"+Character.toUpperCase('A'));
		System.out.println("toUpperCase:"+Character.toUpperCase('a'));
		System.out.println("toUpperCase:"+Character.toUpperCase('1'));
		System.out.println("---------------------------------------");
		
		System.out.println("toLowerCase:"+Character.toLowerCase('A'));
		System.out.println("toLowerCase:"+Character.toLowerCase('a'));
		System.out.println("toLowerCase:"+Character.toLowerCase('1'));
		System.out.println("---------------------------------------");
	}
}
