package _06_func;

public class _00_Return {

	/*함수 형태
	 * [접근 제한자](static)[반환형][메서드명](자료형 인자) #인자 = parameter
	 * 반환형(리턴형)은 자료형이 들어가고
	 * 반환을 하지 않고 싶다면 void를 쓰면 된다.
	 * return 뒤의 값은 반환형에 맞는 자료형의 값
	 */
	public static String methodName(int num) {
		//수행문
		return "String 반환"+num;

	}

	/*
	 * 객체 지향 언어(Object Oriented Programming)에서 함수를 method라고 한다.
	 * 즉, Java에서는 함수를 메서드라고 한다.
	 * 우선 지금은 프로그래밍 기본을 살펴보는 것이므로
	 * 접근제한자와 static에 대한 개념은 생략하겠다.
	 * 그리고 함수 앞을 public static으로 통일한다.
	 */

	public static void main(String[] args) {
		String str = methodName(11);
		System.out.println(str);
		/*
		 * return은 반환한다는 말이다.
		 * 즉, 현 실행 중인 함수를 종료하고
		 * return 뒤의 값을 가지고 나오겠다는 말이다.
		 */
	}
	//	public static void function() {
	//		System.out.println(1);
	//		System.out.println(2);
	//		return;//void 는 return이 생략 가능
	//		System.out.println(3);
	//		System.out.println(4);
	//}//function()
	/*
	 * 비록 컴파일 에러가 떴지만 만일 이대로 실행된다면
	 * 1과 2만 출력되고 3과 4는 출력되지 않을 것이다.
	 * 왜냐하면, return을 만난 순간 fuction()함수가 종료되기 때문이다.
	 */
}
