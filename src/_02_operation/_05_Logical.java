package _02_operation;

public class _05_Logical {
	public static void main(String[] args) {
		//논리연산자(&&,||,!)
		//&&:and(둘다 true 여야지만 true)
		//	||:or(둘 중에 하나라도 true면 true)
		// !:not
		boolean a = true;
		boolean b = false;
		System.out.println(a&&b);
		System.out.println(a||b);

		int n1 = 10, n2 = 5;
		boolean result = (n1==10)&&(n2++==5);
		System.out.println("result : "+result);
		System.out.println("n1 : "+n1+"\nn2 : "+ n2);
		System.out.println("--------");

		n1 = 10;
		n2 = 5;
		boolean result2 = (n1==10)||(n2++==5);
		System.out.println("result : "+result2);
		System.out.println("n1 : "+n1+"\nn2 : "+ n2);



	}

}
