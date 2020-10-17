package _11_useful_class_string;

public class StringEx2 {
	public static void main(String[] args) {
		//		String s = "";
		//		for(int i = 0; i<100000; i++) {
		//			s+=i;
		//		}
		//		System.out.println("완료");
		//String은? immutable=>상수

		String s1 = "Hello";
		System.out.println(System.identityHashCode(s1));
		s1 = "Hello World";
		System.out.println(System.identityHashCode(s1));
		//기존의 "Hello"에서 "World"가 추가되는 것이 아니라
		//기존의 "Hello"를 나두고 새로운 "Hello World"객체를 생성해 가리킨다.
		//왜냐면 String의 값은 한 번 정해지면 변하지 않는 immutable한 객체이기 때문이다.

		//이 문제에 대해선 2가지 방안이 있다.
		//StringBuffer 혹은 StringBuilder를 이용
		//기본적으로 둘의 클래스의 기능은 똑같으므로 StringBuffer만 사용해보겠다.
		//즉, StringBuffer를 쓰듯이 StringBuilder도 똑같이 쓰면 된다.
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.toString());
		System.out.println(System.identityHashCode(sb));
		sb.append(" World");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		//초기화
		System.out.println("초기전 후 : "+ sb.toString());
		sb.setLength(0);
		System.out.println("초기화 후 : "+ sb.toString());

		//StringBuilder vs StringBuffer
		int test = 10000000;
		
		StringBuffer strBuf = new StringBuffer();
		long startStringBuffer = System.currentTimeMillis();
		for(int i = 0; i<test; i++) {
			strBuf.append(i);
		}
		long endStringBuffer = System.currentTimeMillis();
		System.out.println("StringBuffer 걸린 시간 : "+ (endStringBuffer - startStringBuffer));
	/////////////////////////////////
		StringBuilder strBuil = new StringBuilder();
		long startStringBuilder = System.currentTimeMillis();
		for(int i = 0; i<test; i++) {
			strBuil.append(i);
		}
		long endStringBuilder = System.currentTimeMillis();
		System.out.println("StringBuilder 걸린 시간 : "+ (endStringBuilder - startStringBuilder));
	
		String str = "";
		long startString = System.currentTimeMillis();
		for(int i = 0; i<1000; i++) {
			str += i;
		}
		long endString = System.currentTimeMillis();
		System.out.println("String 걸린 시간 : "+ (endString - startString));
		
		//StringBuilder가 거의 무조건 StringBuffer보다 빠르다.
		//그런데 왜 StringBuffer랑 StringBuilder가 따로 있을까?
		//차이점 ...
		//StringBuffer : Thread -Safe, 동기화
		//StringBuilder : 비동기화
	}
}
