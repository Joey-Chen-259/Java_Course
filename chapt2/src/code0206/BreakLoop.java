/**
 * 
 */
package code0206;

/**
 * BreakLoop.java Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class BreakLoop {
	public static void main(String args[]) {
		for (int i = 0; i < 100; i++) {
			if (i == 5)
				break; // ���i����5����ֹѭ��
			System.out.println("i: " + i);
		}
		System.out.println("Loop complete.");
	}

}
