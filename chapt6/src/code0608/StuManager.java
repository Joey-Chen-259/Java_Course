package code0608;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
//����ѧ����
class Student {
	int id;// ѧ��
	String name; // ����
	String gender;// �Ա�
	Date birth; // ��������
	public Student(int id, String name, String gender, Date birth) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
	}
	public String toString() {
		return id + "-" + name + "-" + gender + "-" + birth;
	}
}

//����ѧ��������
public class StuManager {
	int STU_NUM = 10;
	TreeMap stuList = new TreeMap();
	// ��ʼ��ѧ����Ϣ
	void initStudents() {
		for (int i = 0; i < STU_NUM; i++) {
			int id = i;
			String name = "name" + (int) (Math.random() * 1000);
			String gender = "Ů";
			if (i % 2 == 0) {
				gender = "��";
			}
			// ������ɳ�������
			Date birth = new Date(new Date().getTime()
					+ (long) (Math.random() * 1000000000000l));
			Student stu = new Student(id, name, gender, birth);
			stuList.put(id, stu);
		}
	}
	Student searchByID(int id) {
		Student stu = (Student) stuList.get(id);
		return stu;
	}

	// �������ڽ�������,ʹ����򵥵�ð�ݷ�
	List sortStudentByDate() {
		List stus = new ArrayList();
		// ��ѧ�������б�
		stus.addAll(stuList.values());
		// ʹ��ð�ݷ� ���б��е�ѧ������
		for (int i = 0; i < stus.size(); i++) {
			for (int j = 0; j < stus.size(); j++) {
				Student tmp1 = (Student) stus.get(i);
				Student tmp2 = (Student) stus.get(j);
				// �Ƚϳ�������
				if (tmp1.birth.before(tmp2.birth)) {
					stus.set(i, tmp2);
					stus.set(j, tmp1);
				}
			}
		}
		return stus;
	}

	public static void main(String args[]) {
		StuManager manager = new StuManager();
		manager.initStudents();
		// �������һ��ѧ�Ž��м���
		int id = (int) (Math.random() * 10);
		System.out.println("����ѧ�ţ�" + id);
		Student stu = manager.searchByID(id);
		if (stu == null) {
			System.out.println("δ������ѧ����Ϣ");
		} else
			System.out.println("��������ѧ����Ϣ��:" + stu);
		System.out.println("�������������Ľ����");
		List l = manager.sortStudentByDate();
		// �����б�������
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			Student tmp = (Student) iterator.next();
			System.out.println(tmp);
		}
	}
}
