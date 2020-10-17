package _08_oop2;

public class _03_Extends {
	//상속성 ( inheritance )
	public static void main(String[] args) {
		Eagle e = new Eagle("흰머리","갈색");
		e.sound();
		e.getColor();
		Pig p = new Pig("핑크",100);
		p.sound();
		Monkey m = new Monkey("고릴라", 5);
		m.sound();
	}
}
