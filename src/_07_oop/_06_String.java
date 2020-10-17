package _07_oop;

public class _06_String {
	public static void doSomething(String str) {
		str = "Hello World";
	}
	public static void main(String[] args) {
		//Call By Reference...?
		String str = "Hello";
		doSomething(str);
		System.out.println(str); // 기대한 결과값 "Hello World"
		
		//String도 엄연히 클래스이므로 생성할 때 new를 써야된다.
		String ex1 = new String("hi");
		//그러나 워낙 많아 쓰이는 클래스라 그런지 Java에선 특별히 봐준다.
		String ex2 = "hi";
		//그러나 둘의 메카니즘은 차이가 있다.
		//아래와 같이 쓰면 메모리 효율을 위해서 값이 같으면 같은 곳을 가리키게 된다.
		String a = "AAA";
		String b = "AAA";
		System.out.println(a == b); //같은 주소값, true
		
		//아래와 같이 쓰이면 기존 클래스 생성방식을 따르므로 값이 같든 같지 않든 주소값이 다르다.
		String c = new String("BBB");
		String d = new String("BBB");
		System.out.println(c==d); //다른 주소값, false
		System.out.println(c.equals(d)); // 실제 값끼리 비교하고 싶을 때, true
	}
}
