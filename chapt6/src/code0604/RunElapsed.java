/**
 * 
 */
package code0604;

/**
 * RunElapsed.java Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class RunElapsed {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		long start, end, sum = 0, times = 1_000_000_000;
		System.out.println("ִ��" + times + "��ѭ����Ҫ��ʱ��");
		start = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			sum = sum + i * i;
		}
		end = System.currentTimeMillis();
		System.out.println("��Ҫ��ʱ����: " + (end - start) + "����");
	}

}
