package _15_generic2;

import java.util.Collections;

class Society<T extends Person>{
	T mankind;
//	public static void language(Box<? extends Alphabet> lang) {};
//	=
	public static <T extends Alphabet> void language(Box<T> lang) {}; //제네릭 메서드
	
	void wholds(T mankind) {
		this.mankind = mankind;
	}
	//주의!!!
	//class Society<T extends Person> 에서의 T와
	//public static <T extends Alphabet> void language(Box<T> lang) 에서의 T는 다르다.
}

public class _03_GenericMethod {
	public static void main(String[] args) {
//		Box<?> == Box<? extends Object>
		Box<? extends Adult> aCase1 = new Box<>();
//		Box<? extends Adult> aCase2 = new Box<Person>(); //Error
		Box<? extends Adult> aCase3 = new Box<Adult>();
		Box<? extends Adult> aCase4 = new Box<Creator>();
	
		Box<? super Adult> bCase1 = new Box<>();
		Box<? super Adult> bCase2 = new Box<Person>();
		Box<? super Adult> bCase3 = new Box<Adult>();
//		Box<? super Adult> bCase4 = new Box<Creator>(); //Error
		
		Collections collect;
		
//		Society.language(new Box<Object>());
		Society.language(new Box<Alphabet> ());
		Society.<A>language(new Box<A>());
	}
}
