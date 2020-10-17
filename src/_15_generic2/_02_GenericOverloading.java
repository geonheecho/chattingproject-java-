package _15_generic2;

public class _02_GenericOverloading {

	//기존
	public void method(A a) {};
	public void method(B b) {};
	public void method(C c) {};
	public void method(Alphabet alphabet) {};

	//제네릭

	//	public void gMethod(Box<A> a) {};
	//	public void gMethod(Box<B> a) {};
	//	public void gMethod(Box<C> a) {};
	//	
	//	public void gMethod(Box a) {};
	//	public void gMethod(Box b) {};
	//	public void gMethod(Box c) {}; //중복...

	public static void gMethod(Box<?> alphabet) {};

	public static void gLimitMethod(Box<? extends Alphabet> alphabet) {};

	public static void main(String[] args) {
		Box<?> b1 = new Box<Alphabet>();
		Box<?> b2 = new Box<Person>();
		// ? : 와일드 카드

		gMethod(new Box<>());
		gMethod(new Box<Alphabet>());
		gMethod(new Box<A>());
		gMethod(new Box<B>());
		gMethod(new Box<C>());
		gMethod(new Box<Person>()); //갑분싸...
		
		gLimitMethod(new Box<>());
		gLimitMethod(new Box<Alphabet>());
		gLimitMethod(new Box<A>());
		gLimitMethod(new Box<B>());
		gLimitMethod(new Box<C>());
//		gLimitMethod(new Box<Person>()); //Error
	}
}
