class BreakWork{
	public static void main(String[] args){
		double t_money=0;
		int day=0;
		while(t_money<100){
			t_money+=2.5;
			day++;
			if(day%5==0){
				t_money-=6;
			}
		}
		System.out.println(day);
		System.out.println(t_money);

	}
}