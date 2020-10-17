package _99_practice;

public class testTest {
	int i;
	static int j;
	String str = "1객체";
	
	void m() {
		i++;
		j++;
	}
	
	public static void main(String[] args) {
		testTest t1 = new testTest();
		testTest t2 = new testTest();
		String str1 = "1객체";
		String str2 = "2객체";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(t2);
	}
}
