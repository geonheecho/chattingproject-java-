package _11_useful_class.object;

//java.lang.Object
//Object : 모든 객체의 조상
/*
 * clone()
 * equals()
 * getClass()
 * hashCode()
 * toString()
 */

class Pair{
	private int key;
	private String value;

	Pair(int key, String value){
		this.key = key;
		this.value = value;
	}

	int getKey() {
		return key;
	}

	void setKey(int key) {
		this.key = key;
	}

	String getValue() {
		return value;
	}

	void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Pair tmp = (Pair)obj;
		if(this.value.equals(tmp.getValue())) {
			return true;
		}else {
			return false;
		}
	}
}

public class _02_ObjectEx3 {
	public static void main(String[] args) {
		Pair p1 = new Pair(1,"Apple");
		Pair p2 = new Pair(2,"Samsung");
		Pair p3 = new Pair(3, "Apple");

		//각 변수의 값(주소)는 다르다. 그러면 어떻게 객체간에 같지 않은지 비교할까?
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

		//정답은 equals를 쓴다. 단, java.lang.Object에 있는 equals()를 오버라이딩 해서 기준을 만들어야 한다.
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
