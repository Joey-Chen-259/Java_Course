/**
 * 
 */
package code0604;

 /**
 * ShowMemory.java
 * Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class ShowMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Java��������ڴ棺"+r.totalMemory());
		r.gc();//�����ڴ�
		System.out.println("�����ڴ�1:"+r.freeMemory());
		//����10000���ַ�������
		String[] ss=new String[1000000];
		for(int i=0;i<ss.length;i++)
		{
			ss[i]=new String("Java�������");
		}
		System.out.println("�����ڴ�2:"+r.freeMemory());
		for(int i=0;i<ss.length;i++)
		{
			ss[i]=null;
		}
		r.gc();//�����ڴ�
		System.out.println("�����ڴ�3:"+r.freeMemory());
	}

}
