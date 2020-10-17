package _08_oop2;

public class Pig extends Animal{
		int weight;
		
		Pig(String animalName, int weight){
			super(animalName);
			this.weight = weight;
			System.out.println("Pig 객체 생성됨");
		}
		
		public int getWeight() {
			return weight;
		}
}
