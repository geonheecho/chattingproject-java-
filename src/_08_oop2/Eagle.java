package _08_oop2;

public class Eagle extends Animal{
		String color;
		
		Eagle(String animalName, String color){
			super(animalName); //super =>Animal
			this.color = color; //this => Eagle
			System.out.println("Eagle 객체 생성됨");
		}
		
		
		public String getColor() {
			System.out.println(color);
			return color;
		}
	}

