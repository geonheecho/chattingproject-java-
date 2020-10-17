package _07_oop;

//main()은 왜 이렇게 쓰나
public class _09_Main {
	public static void main(String[] args) {
		/*
		 * public : 어디서든 접근 가능. main() 메서드가 프로그래머에 의해 호출되는 것이 아니라 객체가 실행될 떄 운영체제
		 * 				위에 존재하는 JVM에 의해 호출되므로 접근제한이 public이 아니면 접근할 수 없으므로 호출이 불가능하게 됨
		 * 
		 * Static : static 영역, 앞서 배웠든 main이 static이 아니라면 main 이라는 함수가 Stack에 쌓이질 않기 때문에
		 * 				실행자체가 될 수 없다.
		 * 
		 *Void : 호출한 곳이바로 JVM, JVM은 return 형이 있는 main()메서드를 호출하게 되어있다. 즉 return형이 있으면 
		 *				JVM이 호출 못함
		 *
		 *String[] 인자 : 프로그램을 실행할 때 JVM을 통해 main()메서드로 인자를 전달하고자 할 떄 사용됨. JVM이 무조건
		 *							String으로만 인식
		 */
	}
}
