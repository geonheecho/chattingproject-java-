package _08_oop2;
/*
 * 오버로딩(다중정의)
 *  - 적용 범위 : 특정 클래스
 *  - 접근제한자 : 상관없음
 *  - 리턴형 : 상관없음
 *  - 메서드명 : 반드시 같아야함
 *  - 인자 : 반드시 달라야함.
 */
public class _00_Overloading {
	
	public static void doSomething() {
		System.out.println("void doSomething()");
	}
	
	protected static void doSomething(String str) {
		System.out.println("void doSomething(String str)");
	}
	
	private void doSomething(String str1, String str20) {
		System.out.println("void doSomething(String str1, String str2)");
	}
	
	static int doSomething(int num1, int num2) {
		return num1 +num2;
	}
	
	public static void main(String[] args) {
		_00_Overloading.doSomething();
		_00_Overloading.doSomething("Hello");
		new _00_Overloading().doSomething("안","녕");
//		int result = _00_Overloading.doSomething(10,20);
		int result = doSomething(12, 20);
		System.out.println(result);
	}
}
