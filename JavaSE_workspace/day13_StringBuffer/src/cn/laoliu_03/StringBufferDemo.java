package cn.laoliu_03;

//public StringBuffer deleteCharAt(int index)
//public StringBuffer delete(int start,int end)

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");

		System.out.println("sb:" + sb);

// 		//ɾ��e
		// sb.deleteCharAt(1);

// 		//ɾ��world
		// sb.delete(5, 10);

// 		//ɾ������
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);
	}
}
