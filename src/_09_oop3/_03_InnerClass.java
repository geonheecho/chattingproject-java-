package _09_oop3;

class OuterClass{

	String insStr = "인스턴스 변수";
	static String staStr = "클래스 변수";

	void instanceMethod() {
		System.out.println("인스턴스 메서드");
	}

	static void staticMethod() {
		System.out.println("클래스 메서드");
	}

	/***인스턴스형 내부클래스***/
	class InsInnerClass{
		String innerInsStr = "인스턴스 변수";
//				static String innerStaStr = "클래스 변수" //Error

		void innerInstanceMethod() {
			System.out.println("인스턴스 메서드");
		}

		//	static void innerStaticMethod() {			//Error
		//		System.out.println("클래스 메서드");
		//	}

		void forUseOuter() {
			System.out.println(insStr);
			System.out.println(staStr);
			instanceMethod();
			staticMethod();
		}
	}

	/***클래스형 내부클래스***/
	static class StaInnerClass{
		String staInnerInsStr = "인스턴스 변수";
		static String staInnerStaStr = "클래스 변수";

		void staInnerInstanceMethod() {
			System.out.println("인스턴스 메서드");
		}

		static void staInnerStaticMethod() {	
			System.out.println("클래스 메서드");
		}

		void staForUserOuter() {
			//			System.out.println(insStr);	//Error
			System.out.println(staStr);
			//			instanceMethod();	//Error
			staticMethod();
		}
	}
}


public class _03_InnerClass {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
//		outer.innerInstanceMethod();	//Error
		/*
		 * 내부클래스에 있는 기능을 바로 쓸 수 없는 것을 볼 수 있다.
		 * 이유는 OuterClass만 불렀지 InnerClass를 부르진 않았다.
		 */
		OuterClass.InsInnerClass inner1 = new OuterClass().new InsInnerClass();
		OuterClass.StaInnerClass inner2 = new OuterClass.StaInnerClass();
		
		inner1.innerInstanceMethod();
		inner2.staInnerInstanceMethod();
		OuterClass.StaInnerClass.staInnerStaticMethod();
	}
}
