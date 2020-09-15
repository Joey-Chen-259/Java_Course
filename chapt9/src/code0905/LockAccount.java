/**
 * 
 */
package code0905;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReLock.java Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class LockAccount {
	double balance;// �˺����
	Lock lock = new ReentrantLock();// ����������

	public LockAccount(double balance) {
		super();
		this.balance = balance;
	}

	// ʹ����ʾ��
	public void withdraw(double money) {

		lock.lock();// ����
		try {

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

		} finally {
			lock.unlock();// �ͷ���
		}
	}
}

class AccountThread3 extends Thread {
	LockAccount account;
	int delay = 100;

	public AccountThread3(LockAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		// �����˺Ŷ���
		LockAccount account = new LockAccount(1005);
		// ��������ȡ���߳�
		AccountThread3 t1 = new AccountThread3(account);
		AccountThread3 t2 = new AccountThread3(account);
		AccountThread3 t3 = new AccountThread3(account);
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
