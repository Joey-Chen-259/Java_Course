package code0607;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
public class GenericDemo {
	public static void main(String[] args) {
		// �÷��ͺ󣬼����д��Integer���͵�Ԫ��
		ArrayList<Integer> a = new ArrayList<Integer>();
		Random r=new Random();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			a.add(r.nextInt(1000));
		}
		// �������е�Ԫ��������Integer
		for (Iterator<Integer> i = a.iterator(); i.hasNext();) {
			sum =sum+i.next();
		}
		System.out.println(sum);
	}
}
