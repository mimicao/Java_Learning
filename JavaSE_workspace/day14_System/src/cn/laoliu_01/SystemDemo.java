package cn.laoliu_01;

/*
 * public static void gc() //����ʱ��������
 * public static void exit(int status)
 * public static long currentTimeMillis()
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("mimicao", 25);
		System.out.println(p);

		// System.exit(10);
		p = null;
		System.gc();
		
		System.out.println(System.currentTimeMillis());
		
		//ͳ������ʱ��
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.println("hello"+i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Running Time: "+(end-start));
	}
}