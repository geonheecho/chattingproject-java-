package _08_oop2;

public class Child extends Parent{
	String child_var;
	
	Child(){
		System.out.println("Child 객체 생성");
	}
	
	public void childMethod() {
		System.out.println("자식 클래스의 childMethod()");
	}
}
