package _12_wrapper;

class Num{
	int num;
	
	Num(int num){
		this.num = num;
	}
}

public class _00_Intro {
	public static void main(String[] args) {
		//primitive type --> reference type
		//Boolean, Character, Number
		Boolean b  = new Boolean(true);	//boolean
		Character c  = new Character('a'); //char
		Number n1 = new Long(123);	//long
		Number n2 = new Integer(123); //int 
		Number n3 = new Byte((byte) 32);	//byte	//자바는 기본적으로 정수는 int, 실수는 double --> 기본값
		//short --> Short
		//float --> Float
		//double --> Double
		
		int num = 10;		//만일 기본형(primitive type)인 num을 참조형(reference type)으로 바꾸고 싶다면?
		Num refNum = new Num(num);
	}
}