package _08_oop2;

public class SuperClass {
	String superClass_var;
	
	SuperClass(){
		System.out.println("SuperClass 객체 생성");
	}
	//자식에 의해 오버라이딩 되어서 은폐가 되었다.*****
	protected void superClassMethod() {
		System.out.println("부모 클래스의 superClassMethod()");
	}
}
