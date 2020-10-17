package _08_oop2;

public class Animal {
	String animalName;
	
	Animal(String animalName){
		this.animalName = animalName;
	System.out.println("Animal 객체 생성됨");
	}
	
	public void sound() {
		System.out.println(animalName + "이 울부짖습니다.");
	}
}
