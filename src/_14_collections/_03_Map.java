package _14_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Member{
	String id;
	String password;
	String name;

	Member(String id, String password, String name){
		this.id = id;
		this.password = password;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
}

public class _03_Map {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new HashSet();
		//		Collection c3 = new HashMap();	//Error
		//List와 Set은 Collection의 자손이고 Map은 따로 있음
		//이유 : List와 Set은 단일 값을 저장하는 반면, Map은 Key와 Value로 저장하기 때문
		//			같은 인터페이스가 아님, 설계도가 다름, but 자료구조의 일종임


		Member user1 = new Member("aaaa", "1234", "John");
		Member user2 = new Member("bbbb", "2345", "Edward");
		Member user3 = new Member("cccc", "3456", "Zed");

		HashSet<Member> hs = new HashSet();
		hs.add(user1);
		hs.add(user2);
		hs.add(user3);

		//만일 아이디가 bbbb인 유저를 찾고 싶다면?
		System.out.println(hs.contains("bbbb"));
		//false인 이유 --> 주소값으로 저장되어있음(실제 값이 아닌 주소값을 해쉬해서 저장됨)

		//Map : Hashtable, HashMap
		//Hashtable과 HashMap의 관계는 StringBuilder 와 StringBuffer의 관계가 비스
		HashMap hm = new HashMap();	//unsynchronized

		hm.put("aaaa", user1);
		hm.put("bbbb", user2);
		hm.put("cccc", user3);
		System.out.println(hm.containsKey("aaaa"));
		//alt+shift+R
		Set ks = hm.keySet();
		
		Iterator itr = ks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collection vs = hm.values();
		
		itr = vs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
