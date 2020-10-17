package _15_generic;

import java.util.Hashtable;
import java.util.Vector;

public class WowAmazing {
	
	Hashtable Database() {
		Hashtable ht = new Hashtable();
		Object obj = new Object();
		int num3 = 3;
		ht.put(1,new int[] {0,1,2,3,4,5,6,7,8,9,10});
		ht.put(2, "Hello World");
		ht.put(num3, 100+100);
		ht.put(4, 100+100);
		ht.put(obj, new Member("John",15));
		return ht;
	}
	
	public static void main(String[] args) {
		
		Hashtable db = new WowAmazing().Database();
		
		
		Vector v = new  Vector();
		int query = 3;
		
		System.out.println(db.get(query));
		
	}
}
