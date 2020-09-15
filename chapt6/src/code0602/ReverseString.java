/**
 * 
 */
package code0602;

/**
 * ReverseString.java Copyright (c) 2016 ChongQing University All rights
 * reserved.
 */
public class ReverseString {
	public static void main(String args[]) {
		String strSource = new String("I love Java");
		StringBuffer sbuf = new StringBuffer(strSource);
		System.out.println(sbuf.reverse());// ����StringBuffer�ķ�ת������
		String strDest = reverseIt(strSource);
		System.out.println(strDest);
	}

	public static String reverseIt(String source) {
		int i, len = source.length();
		StringBuffer dest = new StringBuffer(len);
		for (i = (len - 1); i >= 0; i--)
			dest.append(source.charAt(i));
		return dest.toString();
	}

}
