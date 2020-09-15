package code0607;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap  tm = new TreeMap();
		Random r=new Random();
		int f=10000;
		// ����Ԫ��
		tm.put("E", f*r.nextDouble());
		tm.put("A", f*r.nextDouble());
		tm.put("B", f*r.nextDouble());
		tm.put("C", f*r.nextDouble());
		tm.put("F", f*r.nextDouble());
		tm.put("D", f*r.nextDouble());
		// �õ��ؼ����б�
		Set set = tm.keySet();
		// �õ�������
		Iterator i = set.iterator();
		// ͨ����������ʾTreeMap�е�ֵ
		while (i.hasNext())
		{
			String key = (String)i.next();
			System.out.println(key + ": " + ((Double)tm.get(key)).doubleValue());
		}
		// �� 1000 ��D's �ʻ�
		double balance = ((Double)tm.get("D")).doubleValue();
		tm.put("D", new Double(balance + 1000));
		System.out.println("D's new balance: " + tm.get("D"));
	}
}
