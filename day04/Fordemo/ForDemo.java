class ForDemo{
	public static void main(String[] args){
		System.out.println("----------------------");
		System.out.println("输出0-9：");
		for( int x=0; x<10; x++ ){
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		System.out.println("输出1-10：");
		for( int x=1; x<=10; x++ ){
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		System.out.println("输出10-1：");
		for( int x=10; x>0; x-- ){
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		int sum1=0;
		for( int x=1; x<11; x++ ){
			sum1+=x;
		}
		System.out.println("计算1-10的和："+sum1);

		System.out.println("----------------------");
		int sum2=0;
		for( int x=1; x<101; x++ ){
			if(x%2==0){
				sum2+=x;
			}
		}
		System.out.println("方式一计算1-100之间偶数的和："+sum2);
		System.out.println("----------------------");
		int sum3=0;
		for( int x=0; x<101; x+=2 ){
			sum3+=x;
		}
		System.out.println("方式二计算1-100之间偶数的和："+sum3);
		
		System.out.println("----------------------");
		int sum4=1;
		for(int x=1; x<6; x++){
			sum4*=x;
		}
		System.out.println("计算5!："+sum4);
		
	}
}