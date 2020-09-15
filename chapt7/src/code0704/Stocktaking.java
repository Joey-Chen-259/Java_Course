package code0704;

import java.io.*;
import java.text.NumberFormat;

public class Stocktaking {

	public static void main(String[] args) throws IOException {
		String numBoxesIn;

		int numBoxes;

		double boxPrice = 3.25;

		NumberFormat currency = NumberFormat.getCurrencyInstance();

		System.out.println("�ж��ٸ����ӣ�");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // �����������Խ����û�����������

		numBoxesIn = in.readLine();

		try {

			numBoxes = Integer.parseInt(numBoxesIn);

			if (numBoxes < 0) {

				throw new NegativeNumberException();

			}

			System.out.println("���ӵ��ܼ�ֵ�ǣ�");

			System.out.println(currency.format(numBoxes * boxPrice));

		} catch (NumberFormatException e) {

			System.out.println("����Ĳ���һ��������");

		} catch (NegativeNumberException e) {

			System.out.println("��������������Ϊ������");

		}

	}

}

class NegativeNumberException extends Exception {

}
