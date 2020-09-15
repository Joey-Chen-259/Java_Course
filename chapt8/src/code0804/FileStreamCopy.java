package code0804;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy {
	public static void main(String[] args) throws IOException {
		int size;
		// ��������������
		FileInputStream f = new FileInputStream("src/code0804/FileStreamCopy.java");
		FileOutputStream fout = new FileOutputStream("copy-of-file.txt");
		System.out.println("�ܳ���: " + (size = f.available()));
		int n = size / 10;
		System.out.print("ʹ�õ��ֽڷ�����ȡ��");
		// ʹ��read()��write
		for (int i = 0; i < n; i++) {
			fout.write(f.read());
		}
		System.out.println("ʣ�೤��: " + f.available());
		System.out.print("��ȡһ���ֽ������");
		// ʹ��read(byte[]b )��write(byte[] b);
		byte b[] = new byte[n];
		f.read(b);
		fout.write(b);
		System.out.println("ʣ�೤�ȣ�" + f.available());
		// ʹ��read(b,offset,len)��write��b,offset,len��
		System.out.print("��ȡ�������ݣ�");
		int count = 0;
		while ((count = f.read(b, 0, n)) != -1)
			fout.write(b, 0, count);
		System.out.println("ʣ�೤��: " + f.available());
		// ���ע��ر���
		f.close();
		fout.flush();
		fout.close();
	}
}
