package _08_oop2;

public class _05_Overriding {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.subClassMethod();
		sub.superClassMethod(); //자식을 이기는 부모없다.
		
		SuperClass sup = new SubClass();
		sup.superClassMethod(); //비록 sup가 SuperClass를 가리키고 있지만 은페되어 있기 때문에 자동으로 자식의 함수 호출
		
		//TEST:  부모 객체와 자식 객체의 주소값은 같을까?
		SuperClass a = new SubClass();
		//SubClass b = (SubClass)a;
		SuperClass b = new SuperClass();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		SuperClass aa = new SuperClass();
		aa.superClassMethod();
	}
}
