package _07_oop;

import java.lang.reflect.Method;

/*
 * OOP : Object Oriented Programming 약자로 객체 지향 프로그래밍이라는 뜻.
 *  실제 세계와 유사한 가상 세계를 컴퓨터 속에 구현하고자 하는 노력의 일환
 *
 * 현실세계의 강아지(-인스턴스화/객체화)-->컴퓨터 세계의 강아지(-인스턴스/객체)
 * instance/object
 */

public class _00_WhatIsClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//객체를 생성하는 방법[Dog]
		Dog dogObj1 = new Dog(); //첫번째 방법
		Dog dogObj2 = Dog.class.newInstance(); //두번째 방법 : Class객체 --> Dog객체 [예외처리 : throws 혹은 try-catch]
		System.out.println(dogObj1);
		System.out.println(dogObj2);
		
		//객체를 생성하는 방법[Class]
		Class dogC1 = new Dog().getClass();
		Class dogC2 = Dog.class;
		Class dogC3 = Class.forName("_07_oop.Dog");
		System.out.println(dogC1);
		System.out.println(dogC2);
		System.out.println(dogC3);
		//reflection 기능
		Method[] m = dogC1.getMethods();
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}
}
