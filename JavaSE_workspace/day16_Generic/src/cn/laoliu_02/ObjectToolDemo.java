package cn.laoliu_02;

public class ObjectToolDemo {
	public static void main(String[] args) {
		// ObjectTool ot = new ObjectTool();
		//
		// ot.setObj(new String("mimicao"));
		// String s = (String) ot.getObj();
		// System.out.println("name:" + s);
		//
		// ot.setObj(new Integer(10));
		// Integer i = (Integer) ot.getObj();
		// System.out.println("Age:" + i);
		//
		// ot.setObj("mamacao");
		// Integer ii = (Integer) ot.getObj();
		// System.out.println("name:" + ii);

		ObjectTool<String> ot = new ObjectTool<>();
		ot.setObj(new String("mimicao"));
		String s = ot.getObj();
		System.out.println("name:" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(20));
		Integer i = ot2.getObj();
		System.out.println("Age:" + i);
	}
}
