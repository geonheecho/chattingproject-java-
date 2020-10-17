package _14_collections;

public class _00_Intro {
	public static void main(String[] args) {
		String stu1_name = "A";
		String stu1_no = "202001";
		String stu1_gender = "male";
		String stu1_finalScore = "97";

		String stu2_name = "B";
		String stu2_no = "202002";
		String stu2_gender = "female";
		String stu2_finalScore = "98";
	
		String stu3_name = "C";
		String stu3_no = "202003";
		String stu3_gender = "male";
		String stu3_finalScore = "99";
	
		//만일 stu가 100개가 있다면...? (노동)
		String[] stuName = {"A", "B", "C"};
		String[] stuNo = {"202001", "202002", "202003"};
		//... 이런식으로 할것이다.
		
		//만일 stu의 no, finalScore를 String이 아닌 int로 바꾸고 싶다면?,
		//동시에 배열 하나달 한 학생의 정보를 보관하고 싶다면?
//		String[] stu1 = {"A", 202001, "male", 97};//Error

		class Student{
			String name ;
			int no;
			String gender;
			int finalScore;
			
			Student(String name, int no, String gender, int finalScore){
				this.name = name;
				this.no =no;
				this.gender = gender;
				this.finalScore = finalScore;
			}
		}//innerClass
		
		//100명의 학생 정보저장
		Student[] stuArr = new Student[100];
		stuArr[0] = new Student("A", 202001, "male", 97);
		stuArr[1] = new Student("B", 202002, "female", 98);
		stuArr[2] = new Student("C", 202003, "male", 99);
		//... 이런식으로 효율적으로 정보저장 가능
		
		//만약 101명째 학생을 받는다면?
		
		/*
		 * 자료구죠란?
		 * 	데이터를 어떻게하면 효과적으로 + 효율적으로 CRUD할 것인가의 고뇌
		 */
	}
}
