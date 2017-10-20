class ArrayDemo2{
	public static void main(String[] args){
		System.out.println("--------------------------");				
		/*
		二维数组的定义格式1，一维和二维元素固定大小
		*/
		int[][] arr = new int[3][2];

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);

		System.out.println("--------------------------");		
		/*
		二维数组的定义格式1，一维和二维元素固定大小
		*/
		int[][] arr2 = new int[3][];
		//int[][] arr3 = new int[][3];//该格式错误
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		arr2[0] = new int[4];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		printArray(arr2);
		
		System.out.println("--------------------------");
		/*
		二维数组的定义格式3
		基本格式: 数据类型[][] 数组名 = new 数据格式[][]{ {元素1, 元素2, ...}, {元素1, 元素2, ...}, {元素1, 元素2, ...} };
		简化格式: 数据类型[][] 数组名 = { {元素1, 元素2, ...}, {元素1, 元素2, ...}, {元素1, 元素2, ...} };
		*/
		int[][] arr3 = {{3, 45, 65},{21, 11, 55, 66, 22, 232},{888, 666, 777}};
		printArray(arr3);
		
		System.out.println("--------------------------");
		arr[0][1] = 100;
		arr[1][0] = 200;
		arr[2][1] = 300;
		
		printArray(arr);
	}
	
	public static void printArray(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
	}
}