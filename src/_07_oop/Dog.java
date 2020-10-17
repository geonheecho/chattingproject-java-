package _07_oop;

public class Dog {
	//속성 : Attribute || Field - 객체의 특징에 대한 정보 값들을 이부분에 변수나 상수로 선언해서 담는다.
	String kind; // 강아지 종류
	int age; //강아지 나이
	int gender; // 강아지 성별

	//생성자 : Constructor : 객체를 생성할 때 항상 실행되며, 맨 처음 실행되는 메서드이다. [초기화]
	Dog(){
		System.out.println("강아지 객체 생성");
	}

	//기능 : Method - 객체의 동작이나 기능을 선언하는 부분이다.
	public void bark() {
		System.out.println("멍멍");
	}
	public void run() {
		System.out.println("[강아지가 뛴다]");
	}
	public void sleep() {
		System.out.println("[강아지가 잔다]");
	}
}
