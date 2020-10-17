package _08_oop2;

class Person{}
class Rob extends Person{}
class Eddie extends Person{}
class Businessman extends Rob{}
class Programmer extends Rob{}
class Engineer extends Eddie{}

public class _07_Polymorphism {
	//polymorphism : 다형성
	public static void main(String[] args) {
		Person pObj = new Person();
		//Businessman p1 = (Businessman)pObj; //Error
		/*
		 * pObj는 Person이라는 객체만 생성했으므로
		 * Businessman 객체가 메모리에 없는 상태이다.
		 * 논리적으로는 서로 상속관계이니 Casting이 가능하고
		 * 컴파일 에러도 없으니 실행에 문제가 없을 것 같지만
		 * 실행 시 "cannot be cast"라는 오류가 뜬다.
		 */
		
		Person pb = new Businessman();
		Person pp = new Programmer();
		Person pe = new Engineer();
		
		Rob r1 = (Rob)pb;
		//Rob r2 = (Eddie)pp; //Error
		/*
		 * 상속 관계상 떨어져 있음
		 */
		Eddie e = (Eddie)pe;
		
		System.out.println(pp instanceof Object); //true
		System.out.println(pp instanceof Person); //true
		System.out.println(pp instanceof Rob); //true
		System.out.println(pp instanceof Eddie); //false
	
		System.out.println(r1 instanceof Rob); //true
		System.out.println(r1 instanceof Businessman); //true
		System.out.println(r1 instanceof Programmer); //false
	}
}
