/**
 * 
 */
package code0604;

/**
 * CallOsProgram.java Copyright (c) 2016 ChongQing University All rights
 * reserved.
 */
public class CallOsProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;

		try {
			//�򿪼��±�
			p = r.exec("notepad");
			//������ͣ1��
			Thread.sleep(1000);
			//�ر��ⲿ����
			p.destroy();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
