package _15_generic2;

public class Box <T>{
	T item;
	 
	public T getItem() {
		 return item;
	 }
	 
	 public void setItem(T item) {
		 this.item = item;
	 }
	 
	 static void sayHello() {
		 System.out.println("안녕하세요");
	 }
	 
	 /** 1)제네릭 클래스에 제네릭 타입을 사용하는 static 메서드(클래스 메서드) + static 속성(클래스 속성)-->사용이 불가하다.**/
	// static T staticVar;
	
	 // static T whatIsIt(T t){
	// return item;
	// }
	 
	 /** 3) 제네릭 타입 안에는 Reference 타입 변수만 들어갈 수 있다. int, double 과 같은 primitive 타입 변수는 불가**/
	 // T t = new T();
	 // T[] tArr = new T[100];
	 
	 public static void main(String[] args) {
		 // Box<int> b2 = new Box<int>();
		 Box<Integer> b2 = new Box<Integer>(); // Warpper class를 사용하자
		//b2.setItem("Hello"); //error
		 b2.setItem(50);
	}
}
