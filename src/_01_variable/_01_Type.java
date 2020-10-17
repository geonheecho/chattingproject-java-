package _01_variable;

/*
 * 변수, 메서드, 클래스 이름 규칙
 *  - 변수, 메서드, 패키지이름 : 첫글자=소문자
 *  - 상수 : 모두 대문자, 구분시_로 구분 (ex.final)
 *  - class: 첫글자=대문자
 *  - 변수명을 지을 때 주의점 : 공백문자x, 숫자로 시작x, 특수문자x(_, $는 제외, but 시스템 관련
 *  변수가 이렇게 된게 많으므로 권장x)
 */

public class _01_Type {
	public static void main(String[] args) {
		/**Primitive Type**/
		//정수형
		byte b; //-128~127(literal), 1byte 크기
		short s; //-32768~32767, 2byte 크기
		int i; // ,4byte 크기
		long l; // ,8byte 크기
		//실수형
		float f; //4byte
		double d; //8byte
		//논리형
		boolean bool; //1bit		0:false, 1:true 참/거짓
		//문자형
		char c; //2byte
		/**Reference Type**/
		String str; //제한없음
		
		byte binary = (byte)0b00000001; //2진수
		byte octal = (byte)034;
		byte hexadecimal = (byte)0x5B;
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexadecimal);
		/*
		 * 각 자료형마다 크기가 정해져 있다.
		 * 예전에는 하드웨어 성능이 좋지 않아서 메모리 낭비를 줄이기 위해 용도에 맞는 자료형을 주었지만
		 * 지금은 성능이 많이 좋아져서 사실상 정수는 int를, 실수는 double 을 기본적으로 쓴다.
		 * 그리고 문자는 String을 쓴다. 첫 글자가 대문자인 것을 보고 알 수 있듯이 String은 클래스 이며 
		 * 크기에 제약이 없다.
		 */
		
		//변수 선언 법 : <자료형 type> <변수 이름 variable> = <값 value>
		int num = 10;
		//상수 선언 법 : 앞에 final을 붙인다.
		final double PI =3.14;
		System.out.println(PI);
		//PI=1.23;//Error : 상수는 값을 바꿀 수 없다.
		
		//변수명을 지을 때 예약어를 사용할 수 없다
		//예약어 : boolean, final double, for, new, try...
		//int final = 100; // Error
		int finalScore =100;
		
		/*변수명을 짓는 요령*/
		// String warning message = "주의하십시오"; // Error : 공백도 엄연히 문자이며,
		//공백이 변수명에 들어가면 에러가 난다.
		//카멜법
		String warningMessage="주의하십시오";
		//헝가리안법
		String sWarningMessage="주의하십시오";
		int iNum=50;
		double dNum=5.5; //앞의 문자를 보고 자료형을 유추할 수 있다.
		//언더바
		String warning_message="주의하십시오";
		 /* 자료형 변환 : Casting*/
		 int aaa=10;
		 System.out.println(aaa);
		 double bbb= (double)aaa; //묵시형 형변환이 이루어짐 : 작은 곳에서 큰 곳으로 담을 땐 캐스팅 필요x,(double)aaa
		 System.out.println(bbb);
		 double ccc= 8.123;
		 System.out.println(ccc);
		 //int ddd=ccc; Error: 큰 곳에서 작은 곳으로 담을 땐 묵시적 형변환이 불가능
		 int ddd= (int)ccc; //명시적 형변환
		 System.out.println(ddd);
		 /**Why? 왜 정수일 땐 int를 쓰고 실수일 땐 double을 쓰는가?**/
		 //자바는 실수를 double형으로, 정수를 int형으로 기본으로 사용한다.
		 double dd=123.456;
		 //float ee = 123.456; //Error
		 float ff1=123.456F;
		 float ff2=(float)123.456;
		 long ok=2147483647;
		 //long ll=2147483648; //Error
		 long ll=2147483648L;
		 //long ll=(long)2147483648;//Error
		 
	}
}
