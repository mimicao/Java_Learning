class ForDemo{
	public static void main(String[] args){
		System.out.println("----------------------");
		System.out.println("���0-9��");
		for( int x=0; x<10; x++ ){
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		System.out.println("���1-10��");
		for( int x=1; x<=10; x++ ){
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		System.out.println("���10-1��");
		for( int x=10; x>0; x-- ){
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		int sum1=0;
		for( int x=1; x<11; x++ ){
			sum1+=x;
		}
		System.out.println("����1-10�ĺͣ�"+sum1);

		System.out.println("----------------------");
		int sum2=0;
		for( int x=1; x<101; x++ ){
			if(x%2==0){
				sum2+=x;
			}
		}
		System.out.println("��ʽһ����1-100֮��ż���ĺͣ�"+sum2);
		System.out.println("----------------------");
		int sum3=0;
		for( int x=0; x<101; x+=2 ){
			sum3+=x;
		}
		System.out.println("��ʽ������1-100֮��ż���ĺͣ�"+sum3);
		
		System.out.println("----------------------");
		int sum4=1;
		for(int x=1; x<6; x++){
			sum4*=x;
		}
		System.out.println("����5!��"+sum4);
		
	}
}