/**
 * 
 */
package code0602;

 /**
 * SplitString.java
 * Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class SplitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����������š���ŵ�������ʽ
		String regex="[����]+"; 
		//���ָ���ַ���
		String s="�й�����á�Java����������ơ�";
		//ʹ�ö��š���ŷָ��ַ���
		String[] ss=s.split(regex);
		for(String a:ss)
		{
			System.out.println(a);
		}
	}
}
