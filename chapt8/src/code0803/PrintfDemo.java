package code0803;
import java.util.Date;
public class PrintfDemo {
	public static void main(String[] args) {
		double d1 = 23456789.567;
		
		int i=65;
		// �ö�����Ϊ�ָ���, ��ʽ��������,�ַ�
		System.out.printf("%1$,.2f\n16���� %2$x= %2$c\n", d1,i);
		Date c =new Date();
		// ��ʽ������
		System.out.printf("����:%1$tF ʱ�䣺%1$tT %1$tA\n", c);
		String s=String.format("����:%1$tF ʱ�䣺%1$tT %1$tA\n", c);
		System.out.println(s);
		
	}
}
