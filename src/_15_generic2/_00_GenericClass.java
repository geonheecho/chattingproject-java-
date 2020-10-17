package _15_generic2;

import java.util.ArrayList;
import java.util.HashMap;

class GenericClass<Whatever>{
	Whatever w;
	public Whatever getW() {
		return w;
	}
	public void setW(Whatever w) {
		this.w =w;
	}
} //즉 , <>안에 있는 것을 제네릭 타입이라고 하는데 사실 어떤 것을 넣어도 상관은 없다. 마치 int a = 10 이렇게 만드는 것처럼
//... 그러나 모두 알다시피 암묵적인 약속이 존재한다. int number_of_persion = 10 이런식으로
//제네릭도 마찬가지다. 자주 쓰이는 것은 T:type, E:element, K:key, V:value이다.

class GenericClassExT<T>{
	T item;
}
class GenericClassExE<E>{
	ArrayList<E> memberDB;
}

class GenericClassExKV<K, V>{
	HashMap<K, V> dictionary;
}

class English<T>{
	T lang;

	public T getLang() {
		return lang;
	}

	public void setLang(T lang) {
		this.lang = lang;
	}
}

class EnglishLanguage<T extends Alphabet>{} //T에 들어갈 수 있는 클래스: Object, Alphabet, A, B, C

public class _00_GenericClass {
	public static void main(String[] args) {
		//우리가 원하는 사용 과정
		English<Alphabet> alphabet = new English<Alphabet>();
		English<A> a = new English<A>();
		English<B> b = new English<B>();
		English<C> c = new English<C>();
		
		//... 그러나 아래도 가능하다.
		English<Adult> adult = new English<Adult>(); //우리는 이렇게 쓰이길 원하지 않는다.
	
		//제네릭 타입을 제한한 이후
		new EnglishLanguage<>();
		new EnglishLanguage<Alphabet>();
		new EnglishLanguage<A>();
		new EnglishLanguage<B>();
		new EnglishLanguage<C>();
//		new EnglishLanguage<Adult>(); //error
	}
}
