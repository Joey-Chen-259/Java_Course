package code0805;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class StreamToReaderWriter
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("src/code0805/StreamToReaderWriter.java");
		FileInputStream fin = new FileInputStream(file);
		FileOutputStream fout = new FileOutputStream("copy-of-file.txt");
		// ���ļ������ֽ������ַ���ת��
		InputStreamReader isr = new InputStreamReader(fin, "GBK");
		//���ļ�����ֽ������ַ���ת��
		OutputStreamWriter osw = new OutputStreamWriter(fout, "GBK");
		System.out.println("��ǰ������������ :"
				+ isr.getEncoding());
		System.out.println("��ǰ�����������:"
				+ osw.getEncoding());
		int n = (int) (file.length() / 30);
		char b[] = new char[n];
		System.out.println("���ƿ�ʼ...");
		int count = 0;
		while ((count = isr.read(b, 0, n)) != -1)
			osw.write(b, 0, count);
		isr.close();
		fin.close();
		osw.flush();
		osw.close();
		fout.flush();
		fout.close();
		System.out.println("������ɡ�");
	}
}
