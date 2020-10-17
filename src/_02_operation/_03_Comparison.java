package _02_operation;

public class _03_Comparison {
	public static void main(String[] args) {
		//비교연산자(>=,<=,>,<,==,!=)
		int a = 10, b=5; //변수의 자료형이 같으면 이런식으로 한번에 선언해도 된다.
		boolean result=a>b;
		System.out.println(result);
		
		System.out.println(5<10);
		System.out.println(10<=10);
		System.out.println(5>10);
		System.out.println(1>=2);
		System.out.println(3==3); //같으면 true
		System.out.println(3!=3); //같지 않으면 true
	}
}
