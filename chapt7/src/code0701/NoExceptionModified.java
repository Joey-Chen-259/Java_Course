package code0701;

import java.io.*;
import java.text.NumberFormat;

public class NoExceptionModified {
	public static void main(String[] args) throws IOException {
		String numBoxesIn;
		int numBoxes;
		double boxPrice = 3.25;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("�ж��ٸ����ӣ�");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		numBoxesIn = in.readLine();
		try {
			numBoxes = Integer.parseInt(numBoxesIn);
			System.out.println("���ӵ��ܼ�ֵ�ǣ�");
			System.out.println(currency.format(numBoxes * boxPrice));
		} catch (NumberFormatException e) {
			System.out.println("����Ĳ���һ��������");
		}
	}
}
