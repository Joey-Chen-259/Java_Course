package code0805;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		// ��������������
		File file = new File("src/code0805/FileReaderWriterDemo.java");
		FileReader f = new FileReader(file);
		FileWriter fout = new FileWriter("copy-of-file.txt");
		System.out.println("��ǰ�ַ����ǣ�" + f.getEncoding());
		int n = (int) (file.length() / 10);
		char b[] = new char[n];//�����ֽ����飬�����ļ�����
		int count = 0;
		System.out.println("��ʼ����");
		int times=0;
		while ((count = f.read(b, 0, n)) != -1)
		{
			times++;
			fout.write(b, 0, count);}
		System.out.println("��������,ʹ�����鸴�ƴ�����"+times);
		f.close();
		fout.close();
	}
}
