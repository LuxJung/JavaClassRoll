package Project_01;

import java.util.ArrayList;
import java.util.Iterator;

//test
public class ClassRoll {
	ArrayList<Student> s;
	Student st;
	String coursename, studentName; // �л� �̸� ��ȯ
	int numStudnt; // �л� �� ���
	boolean check;
	String gitTest;

	public ClassRoll() {
		s = new ArrayList<Student>();
		//�ʱ�ȭ
	}

	void coursename(String s) {
		System.out.println(s);
	}

	void add(Student student) {// �л��߰�
		s.add(student);
	}

	boolean check(int num) {
		if (s.size() == 0)
			check = true;

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).number == num) {
				System.out.println("�ߺ��� �й��Դϴ�");
				check = false;
				break;
			} else {
				check = true;
			}
		}
		System.out.println(check);
		return check;
	}

	
	String search(int num) {
		if (s.size() == 0) {
			System.out.println("�л��� �����ϴ�.");
		} else {
			for (int i = 0; i < s.size(); i++) {
				if (s.get(i).number == num) {
					studentName = s.get(i).name;
				}else {
					
				}
			}
		}
		return studentName;
	}
}
