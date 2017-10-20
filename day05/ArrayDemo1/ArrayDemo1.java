/*
Êý×éµ¹Ðò
*/
class ArrayDemo{
	public static void main(String[] args){
		int[] arr = {50,89,56,41,36,99,45};
		
		reverse(arr);
		listarr(arr);
	}
	
	public static void reverse(int[] arr){
		for(start=0,end=arr.length-1; start<=end; start++, end--){
			int temp;
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=arr[start];
		}
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