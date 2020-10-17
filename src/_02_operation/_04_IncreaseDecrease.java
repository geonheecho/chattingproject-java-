package _02_operation;

public class _04_IncreaseDecrease {
	public static void main(String[] args) {
		//중감연산자 ++,--
		int a=1;
		System.out.println(++a);//전치
		System.out.println(a);
		a=1;
		System.out.println(a++);//후치
		System.out.println(a);
		int b=1;
		int c=b++;
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("===");
		int d=0;
		d++;
		++d;
		d++;
		System.out.println(d);
		
	}
}
