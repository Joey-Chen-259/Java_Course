/**
 * 
 */
package code0805;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ReplaceText.java
 * Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class ReplaceText {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File f;
		String filename;
		System.out.println("�����ļ�����");
		Scanner console=new Scanner(System.in);
		filename=console.nextLine();
		f=new File(new File("src/code0805"),filename);
		
		System.out.println("����Ҫ�滻���ַ�����");
		String  pattern=console.nextLine();
		System.out.println("����Ҫ�滻�Ľ����");
		String  result=console.nextLine();
		PrintWriter pw=new PrintWriter( "replace.txt");
		Scanner reader=new Scanner(f);
		while(reader.hasNextLine())
		{
			String s1=reader.nextLine();
			String s2=s1.replaceAll(pattern, result);
			pw.println(s2);
		}
		console.close();
		pw.close();

	}

}
