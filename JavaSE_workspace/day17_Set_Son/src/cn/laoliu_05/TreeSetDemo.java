package cn.laoliu_05;

import java.util.TreeSet;

/*
 * TreeSet�����򷽷�
 * 1. ��Ȼ����
 * 2. �Ƚ�������
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//��Ȼ����
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// 20,18,23,22,17,24,19,18,24
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);

		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}