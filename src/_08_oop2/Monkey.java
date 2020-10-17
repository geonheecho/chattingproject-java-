package _08_oop2;

public class Monkey extends Animal {
	int age;
	
	Monkey(String animalName, int age){
		super(animalName);
		this.age = age;
		System.out.println("Monkey 객체 생성됨");

	}
	
	public int getAge() {
		return age;
	}
}
