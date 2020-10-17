package _14_collections;

import java.util.HashSet;
import java.util.Iterator;

class Example{
	int value;
	
	Example(int value){
		this.value = value;
	}

	@Override
	public int hashCode() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		Example tmp = (Example)obj;
		if(tmp.value == this.value)
			return true;
		else
			return false;
	}
	
	
}

public class _02_Set {
	public static void main(String[] args) {
		//값 중복 nonope --> 왜냐하면 값이 같으면 해쉬가 같으므로
		HashSet hs = new HashSet();	//정렬하고 싶으면 SortedSet 쓰면 됨
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs);
		System.out.println(hs.contains(20));
		hs.remove(30);
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//HashSet은 hashCode()를 먼저 비교하고 equals()를 비교한다.
		System.out.println("=======================");
		Example e1 = new Example(1);
		Example e2 = new Example(2);
		Example e3 = new Example(2);
		HashSet exSet = new HashSet();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		exSet.add(e1);
		exSet.add(e2);
		exSet.add(e3);
		
		Iterator itr1 = exSet.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		boolean isExistValue = exSet.contains(e2);
		System.out.println(isExistValue);
	}
}
