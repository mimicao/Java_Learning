class MathDemo{
	public static void main(String[] args) {
		double num = Math.random() * 100 + 1;
		System.out.println(num);
		
		for(int i=0; i<100; i++) {
			int num1 = (int)(Math.random() * 100) + 1;
			System.out.println(num1);
		}
	}
}