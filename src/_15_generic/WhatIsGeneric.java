package _15_generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class Box<T>{
	T t;

	T getT() {
		return t;
	}

	void setT(T t) {
		this.t = t;
	}
}

public class WhatIsGeneric {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Member("John", 10));
		al.add(new Member("Steve", 20));
		al.add(new Member("Anne", 30));
		al.add(10);
		al.add("String");

		
		String findUsername = "Steve";
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			try {
				Member mem = (Member)itr.next();

				if(mem.username.equalsIgnoreCase(findUsername)) {
					System.out.println(mem.age);
				}
			}catch(Exception e) {
				System.out.println("정의 되지 않은 데이터가 있습니다");
			}
		}

		ArrayList<Member> gal = new ArrayList<Member>();
		gal.add(new Member("John", 10));
		gal.add(new Member(null, 20));
		gal.add(new Member("Anne", 30));
		
		Iterator<Member> gitr = gal.iterator();

		while(gitr.hasNext()) {
			Member mem = gitr.next();

			if(mem.username.equalsIgnoreCase(findUsername)) {
				System.out.println(mem.age);
			}
		}
		
		
	}
}
