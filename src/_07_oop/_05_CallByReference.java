package _07_oop;

public class _05_CallByReference {
	public static void doSomething(Car car) {
		car.color = "초록색";
	}
	
	public static void main(String[] args) {
		//Call By Reference
		Car car= new Car();
		car.getColor();
		doSomething(car);
		car.getColor();
	}
}
