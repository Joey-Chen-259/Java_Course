/**
 * 
 */
package code0602;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JudgeMobileNumber.java Copyright (c) 2016 ChongQing University All rights
 * reserved.
 */
public class JudgeMobileNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		// ������ʽ��ʾ��һλ��1���ڶ�λΪ3,4,5����βΪ9λ���ֵ�һ������
		p = Pattern.compile("^[1][3-5]+\\d{9}");
		String[] numbers = { "13996332243", "1227788", "15676789065", "139abcd1234" };
		for (String s : numbers) {
			m = p.matcher(s);
			b = m.matches();
			System.out.println("�ֻ�������ȷ��" + b);
		}
	}
}
