/**
 * 
 */
package code0905;

/**
 * RightAccount.java Copyright (c) 2016 ChongQing University All rights
 * reserved.
 */
public class RightAccount {

	double balance;// �˺����

	public RightAccount(double balance) {
		super();
		this.balance = balance;
	}

	// ͬ��������ִ�и÷���ʱ�����������ڶ���Ļ�����
	public synchronized void withdraw(double money) {
		// ����ִ��ȡ�����
		if (balance >= 1000) {

			try {
				Thread.sleep(100);
				balance -= 1000;
				System.out.println("ȡ��1000�ɹ���");
			} catch (Exception e) {

				e.printStackTrace();
			}

		} else {
			System.out.println("ȡ��ʧ�ܡ�");
		}
	}
}

class AccountThread2 extends Thread {
	RightAccount account;
	int delay = 100;

	public AccountThread2(RightAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		// �����˺Ŷ���
		RightAccount account = new RightAccount(1005);
		// ��������ȡ���߳�
		AccountThread2 t1 = new AccountThread2(account);
		AccountThread2 t2 = new AccountThread2(account);
		AccountThread2 t3 = new AccountThread2(account);
		t1.start();
		t2.start();
		t3.start();
		// ���̵߳ȴ������߳̽��������������
		t1.join();
		t2.join();
		t3.join();
		System.out.println("�����˺�����ǣ�" + account.balance);
	}

}