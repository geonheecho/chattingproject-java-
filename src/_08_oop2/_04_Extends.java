package _08_oop2;

public class _04_Extends {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println("=========");
		Parent p2 = new Child();
		System.out.println("=========");
		((Child)p2).childMethod(); //캐스팅 사용
		System.out.println("=========");
//		Child c1 =	new Parent();	//error
		Child c2 = new Child();
		c2.childMethod();
		c2.parentMethod();
	}
}
