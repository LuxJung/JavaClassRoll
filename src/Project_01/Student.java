package Project_01;

public class Student {
	//Student.java: 출석부의 한 학생을 나타낸다.
		public int number; // 학번
		public String name; // 이름
		
		public Student(int number, String name) {
			this.number = number;
			this.name = name;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	//toString 적극활용해주세요~
	
}
