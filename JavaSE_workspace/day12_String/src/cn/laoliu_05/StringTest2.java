package cn.laoliu_05;

public class StringTest2 {
	public static void main(String[] args) {
		String s = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String s1 = "java";
		int count = 0;
		
		count = getStringTime(s, s1);
		
		System.out.println("s1:\""+s1+"\"在\""+s+"\"中的次数："+count+"次");
	}
	
	/*
	 * 寻找字串出现的次数
	 */
	
	public static int getStringTime(String s, String s1) {
		int count = 0;
		int index = 0;
		while(-1 != (index = s.indexOf(s1, index))){
			count++;
			index += s1.length();
		}
		
		return count;
	}
}
