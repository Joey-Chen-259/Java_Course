package code0801;
import java.io.FileWriter;
public class SimpleFileStream {
	public static void main(String[] args) throws Exception {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		// �������̨
		System.out.println("������1��" + sum);
		// �����ļ��������������ļ�f1.txt��
		FileWriter fout = new FileWriter("f1.txt");
		fout.write("������2��" + sum);
		fout.close();
	}
}
