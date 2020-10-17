package _07_oop;

/*
 * Static으로 선언된 메서드나 변수 등은 프로그램이 실행될 때 Stack에 바로 쌓이는 것들이다.
 * 
 */

public class _08_Static {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.name = "자바";
		b2.name = "파이썬";
		System.out.println(b1.name); //b1.getName()
		System.out.println(b2.name); //b2.getName()
		System.out.println(b1.getName());
		System.out.println(b2.getName());
//		String name;
//		static int num;
//		
//		public String getName() {
//			return name;
//		}
//		
//		public static void plusNum() {
//			num++;
		b1.num = 5; //Book.num 이렇게 쓰는게 낫다. 어짜피 공간은 하나다. 공유되고 있다.
		b2.num = 10;
		System.out.println(b1.num);
		System.out.println(b2.num);
		
		b1.plusNum();
		b2.plusNum();
		System.out.println(b1.num);
		System.out.println(b2.num);
	}
}
