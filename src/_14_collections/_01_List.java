package _14_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class _01_List {
	public static void main(String[] args) {
		//ArrayList란 : 가변적으로 변하는 배열
		ArrayList al = new ArrayList();	//기본적으로 배열크기는 10
		ArrayList al2 = new ArrayList(5);	//5크기의 배열 생성
		System.out.println(al);
		al.add("A");	//Object
		al.add(10);	//Object
		al.add("Hello");	//Object
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(1));
		al.remove(0);
		System.out.println(al.get(0));
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("A");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println("----------------");
		int[] iArr = {60, 70,50, 88,75,99,45};
		ArrayList<Integer> scores = new ArrayList<Integer>();

		for(int i = 0; i<iArr.length;i++) {
			scores.add(iArr[i]);
		}
		System.out.println(scores);
		
		//만일 70점 이상인 것들이 몇개인지 알고 싶다면?
		
		//1 : for문 이용
		int cnt = 0;
		for(int i = 0; i<scores.size();i++) {
			//int tmp = (int)scores.get(i);
			int tmp = scores.get(i);
			if(tmp>=70) {
				cnt++;
			}
		}
		System.out.println("70점 이상인 성적 수 : "+ cnt);
		
		//2: iterator
		cnt = 0;
		Iterator<Integer> itr = scores.iterator();
		while(itr.hasNext()) {
			int tmp = (int)itr.next();
			if(tmp>=70) {
				cnt++;
			}
		}
		System.out.println("70점 이상인 성적 수 : "+cnt);

		//LinkedList
		System.out.println();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(20); //중복처리 X
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll.contains(10));
		System.out.println(ll.contains(11));
		System.out.println(ll.peek());
		ll.push(60);
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		
		itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
