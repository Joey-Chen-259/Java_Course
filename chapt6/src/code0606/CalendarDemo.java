package code0606;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// �����������
		Calendar c1 = Calendar.getInstance();
		// ����һ�ܵĵ�һ��Ϊ��һ
		c1.setFirstDayOfWeek(Calendar.MONDAY);
		//�������
		System.out.println(c1.getTime().toString());
		// ��ʾ��ǰ�����ڵĸ�������
		display(c1);
		// ������������ʱ��Ϊ��2020��12��8������8ʱ8��8��
		Calendar c2 = new GregorianCalendar(2020, 11, 8, 20, 8, 8);
		// ����������2010��12��8�ջ��ж�����
		int days = c2.get(Calendar.DAY_OF_YEAR) - c1.get(Calendar.DAY_OF_YEAR);
		System.out.println("����2020��12��8�ջ��У�" + days + "��");
		// �������ں�ʱ�����
		c1.set(2030, 11, 30);
		c1.set(Calendar.HOUR, 10);
		c1.set(Calendar.MINUTE, 29);
		c1.set(Calendar.SECOND, 22);
		System.out.println("���º�ʱ��: ");
		display(c1);
		// �������ں�ʱ��
		c1.add(Calendar.DATE, 10);
		c1.add(Calendar.HOUR_OF_DAY, 10);
		System.out.println("������ʱ��: ");
		display(c1);
	}

	static void display(Calendar c) {
		String months[] = { "һ��", "����", "����", "����", "����", "����", "����", "����", "����", "ʮ��", "ʮһ��", "ʮ����" };
		String days[] = { "", "����һ", "���ڶ�", "������", "������", "������", "������", "������" };
		System.out.print("����: ");
		// ����Ĵ����ӡ����������ֵ
		System.out.print(c.get(Calendar.YEAR) + "��");
		System.out.print(months[c.get(Calendar.MONTH)]);
		System.out.print(c.get(Calendar.DATE) + "�� ");
		System.out.println(days[c.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.print("ʱ��: ");
		System.out.print(c.get(Calendar.HOUR_OF_DAY) + ":");
		System.out.print(c.get(Calendar.MINUTE) + ":");
		System.out.println(c.get(Calendar.SECOND));
	}
}
