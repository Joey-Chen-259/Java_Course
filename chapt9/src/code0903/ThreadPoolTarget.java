/**
 * 
 */
package code0903;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadPool.java
 * Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class ThreadPoolTarget implements Runnable{
	private String targetName;
	Random r=new Random();

	/**
	 * @param targetName
	 */
	public ThreadPoolTarget(String targetName) {
		this.targetName = targetName;
	}

	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<100;i++)
		{
			sum+=r.nextInt(100);
		}
		System.out.println(Thread.currentThread().getName()+"ִ�У�"+this.targetName+" �����"+sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�����̳߳ذ���2���߳�
		ExecutorService pool = Executors.newFixedThreadPool(2);
		//����10���߳����񣬲��ύ���̳߳�
		for(int i=1;i<=10;i++)
		{
			//�����߳�ִ������
			ThreadPoolTarget t=new ThreadPoolTarget("Target"+i);
			//�������ύ���̳߳�
			pool.execute(t);
		}

		
		
		
		
		
	}


}
