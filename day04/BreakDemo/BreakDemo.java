class BreakDemo{
	public static void main(String[] args){
		fl:for(int x=0;x<4;x++){
			sl:for(int y=0;y<5;y++){
				if( y==2 ){
					break;
					//break sl;
					//break fl;
				}
				System.out.print('*');
			}
			System.out.println();
		}
	}
}