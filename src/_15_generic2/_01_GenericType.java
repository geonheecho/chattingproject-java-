package _15_generic2;

public class _01_GenericType {
	public static void main(String[] args) {
		//다형성
		Alphabet alphabet = new Alphabet();
		Alphabet a = new Alphabet();
		Alphabet b = new Alphabet();
		Alphabet c = new Alphabet();
		b = c;
		
		Box<Alphabet> gAlphabet = new Box<Alphabet>();
//		Box<Alphabet> gA = new Box<A>(); //Error
//		Box<Alphabet> gB = new Box<B>(); //Error
//		Box<Alphabet> gC = new Box<B>(); //Error
		
		Box<A> gA = new Box<A>();
		Box<B> gB = new Box<B>();
		Box<C> gC = new Box<C>();
		//제네릭은 양쪽이 같아야 한다.
	}
}
