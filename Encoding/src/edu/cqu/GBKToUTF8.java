package edu.cqu;

import java.io.UnsupportedEncodingException;
/**
 * �ļ�����ΪGBK
 */
public class GBKToUTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String gbkString="GBKתΪUTF-8";
		//תΪUTF-8
		byte[] utf8bytes=gbkString.getBytes("UTF-8");
		String utf8String=new String(utf8bytes,"UTF-8");
		System.out.println(gbkString);
		System.out.println(utf8String);
	}

}
