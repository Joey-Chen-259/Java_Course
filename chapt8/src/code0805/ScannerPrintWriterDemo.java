package code0805;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class  ScannerPrintWriterDemo {
	public static void main(String[] args) {
		Scanner s = null;
		PrintWriter pw = null;
		try {
	//ʹ��Scanner�����ļ��ַ�������������
			s = new Scanner(new FileReader("source.txt"));
			// ʹ��PrintWriter���и�ʽ�����
			pw = new PrintWriter("dest.txt");
			while (s.hasNextLine()) { //�ж��Ƿ���δ����
				String strLine = s.nextLine(); //��ȡһ��
				// ���÷�����ÿһ�еĺ�
				int sum = getLineSum(strLine);
				// ���ÿһ��
				pw.println(strLine + "\t" + sum);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {// �ر��������������
			if (s != null)
				s.close();
			if (pw != null)
				pw.close();
		}
	}
	// ����ÿһ�еĺ͵ķ���
	private static int getLineSum(String strLine) {
		// ʹ��Scanner�ָ�ÿһ��Ϊ�������
		Scanner s = new Scanner(strLine); // ��Scanner�����ַ���
		int sum = 0;
		while (s.hasNextInt()) {  //�ж��Ƿ�������
			sum += s.nextInt();  // �����һ������
		}
		return sum;
	}
}
