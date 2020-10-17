package _07_oop;

public class _04_CallByValue {
	public static void doSomething(int num) {
		num += 10;
	}
	
	public static int doSomething2(int num) {
		num += 10;
		return num;
	}
	
	public static void main(String[] args) {
		//Call By Value
		int num = 5;
		doSomething(num);
		System.out.println(num); // 아무런 변화가 없다.
			
		//Call By Value를 이용해 변화를 구지 일으키고 싶다면 , return값 이용
		num = doSomething2(num);
		System.out.println(num);
	}
}
