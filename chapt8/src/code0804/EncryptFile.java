/**
 * 
 */
package code0804;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * EncryptFile.java Copyright (c) 2016 ChongQing University All rights reserved.
 */
public class EncryptFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		byte pwd = 123;
		FileInputStream f = new FileInputStream("src/code0804/BufferedStreamCopy.java");
		FileOutputStream fout = new FileOutputStream("encrypted.txt");
		System.out.println("��ʼ����...");
		int n = f.available() / 5;
		byte buf[] = new byte[n];
		int count = 0;
		while ((count = f.read(buf, 0, n)) != -1) {
			for (int i = 0; i < count; i++) {
				buf[i] = (byte) (buf[i] ^ pwd);//������ֵ�����������
			}
			fout.write(buf, 0, count);
		}
		System.out.println("��ɼ���");
		f.close();
		fout.close();
		f = new FileInputStream("encrypted.txt");
		fout = new FileOutputStream("unencrypted.txt");
		System.out.println("��ʼ����...");
		n = f.available() / 5;
		buf = new byte[n];
		count = 0;
		while ((count = f.read(buf, 0, n)) != -1) {
			for (int i = 0; i < count; i++) {
				buf[i] = (byte) (buf[i] ^ pwd);//������ֵ�����������
			}
			fout.write(buf, 0, count);
		}
		System.out.println("��ɽ���");
		f.close();
		fout.close();

	}

}
