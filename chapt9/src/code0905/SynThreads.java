/**
 * 
 */
package code0905;

/**
 * SynAccount.java Copyright (c) 2016 ChongQing University All rights reserved.
 */
class SynAccount {
	double balance;//���
	final double MAX = 10000;//����޶�

	public SynAccount(double balance) {

		this.balance = balance;
	}
//���ͬ������
	public synchronized void withdraw(double money) {
		if (balance < money) {
			try {
				System.out.printf("ȡ��%1$,.2fʧ�ܡ���%2$,.2f\n", money,balance);
				wait();//����ȴ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.printf("ȡ��%1$,.2f�ɹ�����%2$,.2f\n", money,balance);
		notify();//���ѵȴ����е��߳�

	}
//ȡ��ͬ������
	public synchronized void deposit(double money) {
		if (balance + money >= MAX) {
			try {
				System.out.printf("���%1$,.2fʧ�ܡ���%2$,.2f\n", money,balance);
				wait();//����ȴ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.printf("���%1$,.2f�ɹ�����%2$,.2f\n", money,balance);
		notify();//���ѵȴ����е��߳�

	}
}

public class SynThreads {
    //ȡ���߳�
	static class Withdrawer extends Thread {
		SynAccount account;

		/**
		 * @param account
		 */
		public Withdrawer(SynAccount account) {
			super();
			this.account = account;
		}

		@Override
		public void run() {
			for (int i = 0; i < 8; i++) {
				account.withdraw(2000);
			}
		}

	}
    //����߳�
	static class Depositor extends Thread {
		SynAccount account;

		/**
		 * @param account
		 */
		public Depositor(SynAccount account) {

			this.account = account;
		}

		@Override
		public void run() {
			for (int i = 0; i < 8; i++) {
				account.deposit(2000);
			}
		}
	}

	public static void main(String[] args) {
		SynAccount account = new SynAccount(5000);
		Thread withdraw = new Withdrawer(account);
		Thread deposit = new Depositor(account);
		withdraw.start();
		deposit.start();
		;
	}

}
