/**
 * 
 */
package code0606;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * FormatDate.java Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class FormatDate {

	public static void main(String[] args) throws ParseException {
		// ������ʽ�����������յ�ʹ���ض���ĸ��Ϊռλ��
		SimpleDateFormat myFmt = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat myFmt1 = new SimpleDateFormat("yy/MM/dd HH:mm");
		SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat myFmt3 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss�� E ");
		SimpleDateFormat myFmt4 = new SimpleDateFormat("һ���еĵ� D �� һ���е�w������ һ���е�W������ ��һ����kʱ zʱ��");
		Date now = new Date();
		System.out.println(now.toString());
		// ��ʽ�����
		String ds1 = myFmt.format(now);
		System.out.println(ds1);
		System.out.println(myFmt1.format(now));
		System.out.println(myFmt2.format(now));
		System.out.println(myFmt3.format(now));
		System.out.println(myFmt4.format(now));
		// �����ַ���Ϊ���ڶ���
		String ds2 = "2026��06��17�� 10ʱ38��52��";
		Date d = myFmt.parse(ds2);
		//���������������ڼ���
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.YEAR, 20);
		System.out.println(c.getTime());

	}

}
