package Project_01;

import java.util.ArrayList;
import java.util.Iterator;

//test
public class ClassRoll {
	ArrayList<Student> s;
	Student st;
	String coursename, studentName; // 학생 이름 반환
	int numStudnt; // 학생 수 기억
	boolean check;
	String gitTest;

	public ClassRoll() {
		s = new ArrayList<Student>();
		//초기화
	}

	void coursename(String s) {
		System.out.println(s);
	}

	void add(Student student) {// 학생추가
		s.add(student);
	}

	boolean check(int num) {
		if (s.size() == 0)
			check = true;

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).number == num) {
				System.out.println("중복된 학번입니다");
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
			System.out.println("학생이 없습니다.");
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
