package Project_01;

import java.util.Scanner;
// hannaitbook@naver.com
// ���� ������ �Ʒ��� �����ϰ� ���ּ���.
// [�Ȼ�] JAVA �л� ����� ���� 1�ܰ� - ���ѳ�/�̵γ� ����
// #�������� �߰����ּ���(��..�ǹ� ���� �ൿ������ ���ּ���!)
// #�л��� �߰����ּ���.
// #�л��� �˻��ؼ�, �����ϸ� ������ְ�
// #�������� ������ ���ٰ� �ȳ����ּ���
// #ClassRollDriver.java �ڵ�� ���� �Ұ���!!!
// #ClassRollDriver.java ������� �ڵ����ּ���

public class ClassRollDriver {

	public static void main(String[] args) {
		// ������
		Scanner scan = new Scanner(System.in);
		int choice; // ����� ����
		String coursename; // �������
		String name; // �̸�
		int number; // �й�
		Student student; // Student ��ü ��������

		ClassRoll sbook = new ClassRoll();

		// ��������� �Է� �޴´�
		System.out.print("��������� �Է��ϼ���: ");
		coursename = scan.next();

		// �⼮���� ��������� �Է� ���� �Ա���������� �����Ѵ�
		sbook.coursename = coursename;

		do {
			// ����ڰ� ���ϴ� ������ �����ϰ� �Ѵ�
			System.out.println("���ϴ� ������ �����ϼ���:");
			System.out.print("1.�߰�  ");
			System.out.print("2.ã��  ");
			System.out.println("3.����");

			choice = scan.nextInt();

			// ������� ���ÿ� ���� ������ �����Ѵ�
			if (choice == 1) {
				// �߰��ϴ� �л��� �й��� �̸��� �Է� ���� �� �� �л��� �⼮�ο� �߰��Ѵ�
				System.out.print("�߰��ϴ� �л��� �й��� �Է��ϼ���: ");
				number = scan.nextInt(); // (�߰�)�й��� �ߺ��� ��� ����ó��
				sbook.check(number);
				if (sbook.check==true) {
					System.out.print("�߰��ϴ� �л��� �̸��� �Է��ϼ���: ");
					name = scan.next();
					student = new Student(number, name);
					sbook.add(student);
				}
				
				
				
				
				
				
				
				
			} else if (choice == 2) {
				// ã�� �л��� �й��� �Է� ���� �� �� �л��� �̸��� ����Ѵ�
				System.out.print("ã�� �л��� �й��� �Է��ϼ���: ");
				number = scan.nextInt();
				name = sbook.search(number);
				if (name != null)
					System.out.println(number + "�� �̸�: " + name);
			}
			
			
			
		} while (choice != 3);
	}

}
