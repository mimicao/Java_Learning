class WhileDemo{
	public static void main(String[] args){
		double sum = 0.01;
		int count=0;
		while(sum <= 8848){
			sum*=2;
			count++;
		}
		
		System.out.println(count);
		
		System.out.println("----------------------");
		for(int x=0;x<4;x++){
			for(int y=0;y<5;y++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("----------------------");		
		for(int x=0;x<5;x++){
			for(int y=0;y<=x;y++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("----------------------");		
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+(x*y)+'\t');
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		}
}