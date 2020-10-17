package _08_oop2;

public class SubClass extends SuperClass {
	String subClass_var;
	
	SubClass(){
		System.out.println("Subclass 객체 생성");
	}
	
	public void subClassMethod() {
		System.out.println("자식 클래스의 subClassMethod()");
	}
	
	@Override //Annotation -->에노테이션
	public void superClassMethod() { //자식은 부모보다 쪼잔해서는 안된다.
		System.out.println("자식 클래스의 superClassMethod()");
	}
}
