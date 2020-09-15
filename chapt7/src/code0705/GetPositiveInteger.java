package code0705;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class GetPositiveInteger {

	public static void main(String[] args) throws IOException {
		String inputStr;

		int inputNum;

		boolean gotGoodInput = false;

		do {

			try {

				System.out.println("������һ����������");

				BufferedReader in = new BufferedReader(new InputStreamReader(

						System.in));

				inputStr = in.readLine();

				inputNum = Integer.parseInt(inputStr);

				if (inputNum <= 0) {

					throw new NegativeIntegerException();

				}

				gotGoodInput = true;

			} catch (NumberFormatException e) {

				System.out.println("����Ĳ���һ�����������������롣");

			} catch (NegativeIntegerException e) {

				System.out.println("����Ĳ���һ�������������������롣");

			}

		} while (!gotGoodInput);

	}

}

class NegativeIntegerException extends Exception {

}
