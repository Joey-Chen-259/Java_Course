/**
 * 
 */
package code0901;

/**
 * SimpleThreadTest.java Copyright (c) 2016 ChongQing University All rights
 * reserved.
 */
public class SimpleThreadTest {
	public static void main(String[] args) {
		// �����̶߳���:
		Thread sum = new SumThread();
		Thread squareSum = new SquareSumThread();
		// �����߳�
		sum.start();
		squareSum.start();
	}
}

// �̳�Thread�����߳�
class SumThread extends Thread {
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i * i;
		}
		System.out.println("ƽ����:" + sum);
	}
}

// �̳�Thread�����߳�
class SquareSumThread extends Thread {
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("��:" + sum);
	}

}
