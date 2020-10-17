package _08_oop2;

public class Parent {
	String parent_var;
	
	Parent(){
		System.out.println("Parent 객체 생성");
	}
	
	public void parentMethod() {
		System.out.println("부모 클래스의 parentMethod()");
	}
}
