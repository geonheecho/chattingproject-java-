package _01_variable;

import java.io.Console;

public class _00_System {

// main을 쓰고 [ctrl+space]를 하면 자동완성이 된다.
/*
 * main 함수는 Java가 실행할 때 JVM이 먼저 접근하는 함수이다.(함수function=메서드method)
 */
	public static void main(String[] args) {
// sysout을 쓰고 [ctrl+space]를 하면 자동완성이 된다.
//	그 밖에 도움이 되는 단축키는 코드를 자동 정렬해주는 [ctrl + i] 가 있다
//+코드 복사 단축키 : [ctrl+alt+↑↓]
//+코드 이동 단축키 : [alt+↑↓]	
		System.out.println("hello java world");//출력 가능
		System.out.println("안"+"녕"+"하"+"세"+"요"); //문자끼리 합칠 때 +를 쓴다
		System.out.println(20000);
//[ctrl+F11]을 하면 실행이 된다
		
		Console c; // import의 단축키 [ctrl+shift+o]

		//		이스케이프 문자 : Java의 예약어를 쓰고 싶을 때 \를 붙여서 사용하는 것 프로그램의 시작
		System.out.println("hello \"java\" world");
		System.out.println("hello\njava\nworld");
		System.out.print("This\n");System.out.println("This");
		
		//서식문자
		System.out.println("자바 공부"+3+"일째..."); // 숫자랑 문자가 합쳐지면 문자가 된다.(숫자+문자=문자)
		System.out.printf("%s 공부 %d일째...\n","C언어",10); //%s 문자, %d 숫자
		/*
		 * ' ' : 단일 문자 char
		 * " " : 문장 String
		 */
		
		//세미 콜론(;)과 코드 블록({...})
		System.out.print("a");System.out.print("b");System.out.print("c");
		System.out.println();
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		/*
		 * 위 두 코드는 똑같다. 위와 같이 한줄로 프로그래밍을 해도 컴퓨터가 끊어서 해석하는게 가능하다.
		 * 그 이유는 코드의 끝을 알리는 세미콜론(;)이 있어서다.
		 */
	}
	void function1()
	{
		System.out.println("블록스타일1");
	}
	void function2() {
		System.out.println("블록스타일2");
	}
	void function3() {System.out.println("블록스타일3");}
}
