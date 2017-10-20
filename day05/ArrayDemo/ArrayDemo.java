/*
依次输出数组元素
*/
class ArrayDemo{
	public static void main(String[] args){
		int[] a = {2, 3, 4, 5, 6};
		
		System.out.println(a.length);
		
		for( int x=0; x<a.length; x++ ){
			System.out.println(a[x]);
		}
		System.out.println("--------------------");
		
		listarr(a);
	}
	
	public static void listarr(int[] a){
		for( int x=0; x<a.length; x++ ){
			if( x==a.length ){
				System.out.println(a[x]);
			}else{
				System.out.print(a[x]+", ");

			}
		}
	}
}