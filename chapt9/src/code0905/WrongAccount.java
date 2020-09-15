/**
 * 
 */
package code0905;

 /**
 * WrongAccount.java
 * Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class WrongAccount {

	double balance;//�˺����
	public WrongAccount(double balance) {
		super();
		this.balance = balance;
	}

}
class AccountThread extends Thread
{
	WrongAccount account;
	int delay=100;
	public AccountThread(WrongAccount account) {
		super();
		this.account = account;
	}
	
	
	@Override
	public void run() {
		//����ִ��ȡ�����
		if(account.balance>=1000)
		{
			
			try {
				sleep(delay);
				account.balance-=1000;
				System.out.println("ȡ��1000�ɹ���");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}else
		{
			System.out.println("ȡ��ʧ�ܡ�");
		}
		
		
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		//�����˺Ŷ���
		WrongAccount account=new WrongAccount(1005);
		//��������ȡ���߳�
		AccountThread t1=new AccountThread(account);
		AccountThread t2=new AccountThread(account);
		AccountThread t3=new AccountThread(account);
	    t1.start();
	    t2.start();
	    t3.start();
	    //���̵߳ȴ������߳̽��������������
	    t1.join();
	    t2.join();
	    t3.join();
	    System.out.println("�����˺�����ǣ�"+account.balance);
	}
	
	
}