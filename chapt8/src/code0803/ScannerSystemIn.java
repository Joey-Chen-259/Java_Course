package code0803;
import java.util.Scanner;
public class ScannerSystemIn {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);//��װ��׼������
		int a = sin.nextInt();//��ȡ����
		double b = sin.nextDouble();//��ȡ������
		double result = a * b;
		System.out.println("a*b=" + result);
	}
}
