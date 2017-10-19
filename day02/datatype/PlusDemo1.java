class PlusDemo1{
	public static void main(String[] args){
		System.out.println('a');//a
		System.out.println('a'+1);//98
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
		
		float f1 = (float)123456789123456789123456789123456789123456.15;
		float f2 = 123456789123456789123456789123456789123456.15f;
		
		System.out.println(f1 + "+" + f2);
	}
}